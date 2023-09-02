class SolutionWithoutDirection {
    public List<Integer> spiralOrder(int[][] matrix) { // O(M * N) where M is the number of rows (matrix.length) and N is the number of columns (matrix[0].length)
        List<Integer> spiralOrder = new ArrayList<>(); // O(1)
        int rows = matrix.length; // O(1)
        int cols = matrix[0].length; // O(1)
        int up = 0, left = 0, right = cols - 1, down = rows - 1; // O(1)

        while (spiralOrder.size() < rows * cols) { // O(M * N)
            for (int i = left; i <= right; i++) { // O(N)
                spiralOrder.add(matrix[up][i]); // O(1)
            }

            for (int i = up + 1; i <= down; i++) { // O(M)
                spiralOrder.add(matrix[i][right]); // O(1)
            }

            if (up != down) { // O(1)
                for (int i = right - 1; i >= left; i--) { // O(N)
                    spiralOrder.add(matrix[down][i]); // O(1)
                }
            }
            
            if (left != right) { // O(1)
                for (int i = down - 1; i > up; i--) { // O(M)
                    spiralOrder.add(matrix[i][left]); // O(1)
                }
            }

            left++; // O(1)
            up++; // O(1)
            right--; // O(1)
            down--; // O(1)
        }
        
        return spiralOrder; // O(1)
    }
}
