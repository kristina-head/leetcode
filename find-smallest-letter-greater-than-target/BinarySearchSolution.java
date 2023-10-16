class BinarySearchSolution {
    public char nextGreatestLetter(char[] letters, char target) { // O(log N)
        int start = 0, end = letters.length - 1; // O(1)

        while (start <= end) { // O(log N)
            int mid = (start + end) / 2; // O(1)

            if (letters[mid] <= target) { // O(1)
                start = mid + 1; // O(1)
            } else {
                end = mid - 1; // O(1)
            }
        }

        return start == letters.length ? letters[0] : letters[start]; // O(1)
    }
}
