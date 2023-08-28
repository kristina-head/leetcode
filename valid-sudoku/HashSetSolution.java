class HashSetSolution {
    public boolean isValidSudoku(char[][] board) { // O(N * N) -> O(1) as N is always equal to 9
        int n = 9; // O(1)
      
        List<HashSet<Character>> grids = new ArrayList<>(n); // O(1)
        List<HashSet<Character>> rows = new ArrayList<>(n); // O(1)
        List<HashSet<Character>> cols = new ArrayList<>(n); // O(1)
        
        for (int i = 0; i < n; i++) { // O(N) -> O(1)
            grids.add(new HashSet<>()); // O(1)
            rows.add(new HashSet<>()); // O(1)
            cols.add(new HashSet<>()); // O(1)
        }
        
        for (int i = 0; i < n; i++) { // O(N) -> O(1)
            for (int j = 0; j < n; j++) { // O(N) -> O(1)
                char val = board[i][j]; // O(1)
              
                if (val == '.') continue; // O(1)
              
                int k = (i / 3) * 3 + (j / 3); // O(1)
              
                if (grids.get(k).contains(val)) return false; // O(1)
                if (rows.get(i).contains(val)) return false; // O(1)
                if (cols.get(j).contains(val)) return false; // O(1)

                grids.get(k).add(val); // O(1)
                rows.get(i).add(val); // O(1)
                cols.get(j).add(val); // O(1)
            }
        }
        
        return true; // O(1)
    }
}
