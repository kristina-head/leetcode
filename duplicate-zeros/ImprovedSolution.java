class ImprovedSolution {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        for (int left = 0; left <= length - possibleDups; left++) {
            if (arr[left] == 0) {  
                if (left == length - possibleDups) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        for (int i = length - possibleDups; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
