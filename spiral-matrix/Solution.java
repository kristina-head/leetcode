class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralOrder = new ArrayList<Integer>(); 
        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
        int direction = 1;
        
        while (top <= bottom && left <= right) {
            if (direction == 1) {
                for (int i = left; i <= right; i++) {
                    spiralOrder.add(matrix[top][i]);
                }
                top++;
                direction = 2;
            }
            
            else if (direction == 2) {
                for (int i = top; i <= bottom; i++) {
                    spiralOrder.add(matrix[i][right]);
                }
                right--;
                direction = 3;
            }
            
            else if (direction == 3) {
                for (int i = right; i >= left; i--) {
                    spiralOrder.add(matrix[bottom][i]);
                }
                bottom--;
                direction = 4;
            }
            
            else if (direction == 4) {
                for (int i = bottom; i >= top; i--) {
                    spiralOrder.add(matrix[i][left]);
                }
                left++;
                direction = 1;
            }
        }
        
        return spiralOrder;
    }
}
