class Solution {
    public int numTeams(int[] rating) { // O(N^3)
        int length = rating.length; // O(1)
        int teams = 0; // O(1)
        
        for (int i = 0; i < length; i++) { // O(N^3)
            for (int j = i+1; j < length; j++) { // O(N^2)
                for (int k = j+1; k < length; k++) { // O(N)
                    if ((rating[j] > rating[i] && rating[j] < rating[k]) ||
                        (rating[j] < rating[i] && rating[j] > rating[k])) { // O(1)
                        teams++; // O(1)
                    }
                }
            }
        }
        
        return teams; // O(1)
    }
}
