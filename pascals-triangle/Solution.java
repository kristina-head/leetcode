class Solution {
    public List<List<Integer>> generate(int numRows) { // O(N^2) 
        List<List<Integer>> pascalsTriangle = new ArrayList<>(); // O(1)
        
        for (int i = 1; i <= numRows; i++) { // O(N)
            List<Integer> row = new ArrayList<>(); // O(1)
            
            for (int j = 0; j < i; j++) { // O(i) -> O(N)
                if (j == 0 || j == i - 1) { // O(1)
                    row.add(1); // O(1)
                } else {
                    List<Integer> prevRow = pascalsTriangle.get(i - 2); // O(1)
                    int sum = prevRow.get(j - 1) + prevRow.get(j); // O(1)
                    row.add(sum); // O(1)
                }
            }
            
            pascalsTriangle.add(row); // O(1)
        }
        
        return pascalsTriangle; // O(1)
    }
}
