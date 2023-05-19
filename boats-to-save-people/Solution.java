class Solution {
    public int numRescueBoats(int[] people, int limit) { // O(N log N)
        Arrays.sort(people); // O(N log N)
        int i = 0; // O(1)
        int j = people.length - 1; // O(1)
        int boats = 0; // O(1)

        while (i <= j) { // O(N)
            boats++; // O(1)
            if (people[i] + people[j] <= limit) i++; // O(1)
            j--; // O(1)
        }

        return boats; // O(1)
    }
}
