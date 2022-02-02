class Solution {
    public List<Integer> spiralOrder(int[][] matrix) { // O(M*N)
        List<Integer> spiralOrder = new ArrayList<Integer>(); // O(1)
        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1; // O(1)
        int direction = 1; // O(1)
        
        while (top <= bottom && left <= right) { // O(M*N)
            if (direction == 1) { // O(1)
                for (int i = left; i <= right; i++) { // O(N)
                    spiralOrder.add(matrix[top][i]); // O(1)
                }
                top++; // O(1)
                direction = 2; // O(1)
            }
            
            else if (direction == 2) { // O(1)
                for (int i = top; i <= bottom; i++) { // O(M)
                    spiralOrder.add(matrix[i][right]); // O(1)
                }
                right--; // O(1)
                direction = 3; // O(1)
            }
            
            else if (direction == 3) { // O(1)
                for (int i = right; i >= left; i--) { // O(N)
                    spiralOrder.add(matrix[bottom][i]); // O(1)
                }
                bottom--; // O(1)
                direction = 4; // O(1)
            }
            
            else if (direction == 4) { // O(1)
                for (int i = bottom; i >= top; i--) { // O(M)
                    spiralOrder.add(matrix[i][left]); // O(1)
                }
                left++; // O(1)
                direction = 1; // O(1)
            }
        }
        
        return spiralOrder; // O(1)
    }
}
