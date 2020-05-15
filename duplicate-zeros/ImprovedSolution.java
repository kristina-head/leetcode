class ImprovedSolution {
    public void duplicateZeros(int[] arr) { // O(N)
        int possibleDups = 0; // O(1)
        int length = arr.length - 1; // O(1)

        for (int left = 0; left <= length - possibleDups; left++) { // O(N)
            if (arr[left] == 0) { // O(1)
                if (left == length - possibleDups) { // O(1)
                    arr[length] = 0; // O(1)
                    length -= 1; // O(1)
                    break;
                }
                possibleDups++; // O(1)
            }
        }

        for (int i = length - possibleDups; i >= 0; i--) { // O(N)
            if (arr[i] == 0) { // O(1)
                arr[i + possibleDups] = 0; // O(1)
                possibleDups--; // O(1)
                arr[i + possibleDups] = 0; // O(1)
            } else {
                arr[i + possibleDups] = arr[i]; // O(1)
            }
        }
    }
}
