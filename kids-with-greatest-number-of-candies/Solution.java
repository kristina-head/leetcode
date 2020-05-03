class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) { // O(N)
        int candiesLength = candies.length; // O(1)
        int maxCandy = 0; // O(1)
        
        for (int candy : candies) { // O(N)
            maxCandy = Math.max(maxCandy, candy); // O(1)
        }
        
        List<Boolean> kids = new ArrayList<>(candiesLength); // O(N)
        
        for (int i = 0; i < candiesLength; i++) { // O(N)
            kids.add(candies[i] + extraCandies >= maxCandy); // O(1)
        }
        
        return kids; // O(1)
    }
}
