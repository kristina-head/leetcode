class Solution {
    public int[][] generateMatrix(int n) { // O(N^2)
        int[][] spiralMatrix = new int[n][n]; // O(1)
        int val = 1; // O(1)
        int up = 0, left = 0, right = n - 1, down = n - 1; // O(1)

        while (val <= n * n) { // O(N^2)
            for (int i = left; i <= right; i++) { // O(N)
                spiralMatrix[up][i] = val++; // O(1)
            }

            for (int i = up + 1; i <= down; i++) { // O(N)
                spiralMatrix[i][right] = val++; // O(1)
            }

            if (up != down) { // O(1)
                for (int i = right - 1; i >= left; i--) { // O(N)
                    spiralMatrix[down][i] = val++; // O(1)
                }
            }

            if (left != right) { // O(1)
                for (int i = down - 1; i > up; i--) { // O(N)
                    spiralMatrix[i][left] = val++; // O(1)
                }
            }

            up++; // O(1)
            left++; // O(1)
            right--; // O(1)
            down--; // O(1)
        }

        return spiralMatrix; // O(1)
    }
}
