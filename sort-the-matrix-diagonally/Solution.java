class Solution {
    public int[][] diagonalSort(int[][] mat) { // O(N*M)
        int row = mat.length; // O(1)
        int col = mat[0].length; // O(1)
        HashMap<Integer, PriorityQueue<Integer>> diagonal = new HashMap<>(); // O(1)
        
        for (int i = 0; i < row; ++i) { // O(N)
            for (int j = 0; j < col; ++j) { // O(M)
                diagonal.putIfAbsent(i - j, new PriorityQueue<>()); // O(1)
                diagonal.get(i - j).add(mat[i][j]); // O(1)
            }
        }
        
        for (int i = 0; i < row; ++i) { // O(N)
            for (int j = 0; j < col; ++j) { // O(M)
                mat[i][j] = diagonal.get(i - j).poll(); // O(1)
            }
        }
        
        return mat; // O(1)
    }
}
