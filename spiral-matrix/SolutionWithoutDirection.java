class SolutionWithoutDirection {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralOrder = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int up = 0, left = 0, right = cols - 1, down = rows - 1;

        while (spiralOrder.size() < rows * cols) {
            for (int i = left; i <= right; i++) {
                spiralOrder.add(matrix[up][i]);
            }

            for (int i = up + 1; i <= down; i++) {
                spiralOrder.add(matrix[i][right]);
            }

            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    spiralOrder.add(matrix[down][i]);
                }
            }
            
            if (left != right) {
                for (int i = down - 1; i > up; i--) {
                    spiralOrder.add(matrix[i][left]);
                }
            }

            left++;
            up++;
            right--;
            down--;
        }
        
        return spiralOrder;
    }
}
