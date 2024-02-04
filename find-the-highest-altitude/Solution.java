class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0, largestAltitude = altitude;

        for (int netGain : gain) {
            altitude += netGain;
            largestAltitude = Math.max(largestAltitude, altitude);
        }

        return largestAltitude;
    }
}
