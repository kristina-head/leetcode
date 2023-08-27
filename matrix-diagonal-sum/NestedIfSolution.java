class NestedIfSolution {
    public int diagonalSum(int[][] mat) { // O(N)
        int sum = 0; // O(1)
        
        for (int i = 0; i < mat.length; i++) { // O(N)
            sum += mat[i][i]; // O(1)

            if (i != mat.length - (1 + i)) { // O(1)
                sum += mat[i][mat.length - (1 + i)]; // O(1)
            }
        }

        return sum; // O(1)
    }
}
