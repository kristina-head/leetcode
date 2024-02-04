class Solution {
    public int largestAltitude(int[] gain) { // O(N)
        int altitude = 0, largestAltitude = altitude; // O(1)

        for (int netGain : gain) { // O(N)
            altitude += netGain; // O(1)
            largestAltitude = Math.max(largestAltitude, altitude); // O(1)
        }

        return largestAltitude; // O(1)
    }
}
