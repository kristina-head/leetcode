class HashSetSolution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
      
        List<HashSet<Character>> grids = new ArrayList<>(n);
        List<HashSet<Character>> rows = new ArrayList<>(n);
        List<HashSet<Character>> cols = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
            grids.add(new HashSet<>());
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char val = board[i][j];
              
                if (val == '.') continue;
              
                int k = (i / 3) * 3 + (j / 3);
              
                if (grids.get(k).contains(val)) return false;
                if (rows.get(i).contains(val)) return false;
                if (cols.get(j).contains(val)) return false;          

                grids.get(k).add(val);
                rows.get(i).add(val);
                cols.get(j).add(val);
            }
        }
        
        return true;
    }
}
