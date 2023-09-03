class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int val = 1;
        int up = 0, left = 0, right = n - 1, down = n - 1;

        while (val <= n * n) {
            for (int i = left; i <= right; i++) {
                spiralMatrix[up][i] = val++;
            }

            for (int i = up + 1; i <= down; i++) {
                spiralMatrix[i][right] = val++;
            }

            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    spiralMatrix[down][i] = val++;
                }
            }

            if (left != right) {
                for (int i = down - 1; i > up; i--) {
                    spiralMatrix[i][left] = val++;
                }
            }

            up++;
            left++;
            right--;
            down--;
        }

        return spiralMatrix;
    }
}
