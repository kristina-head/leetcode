class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = pascalsTriangle.get(i - 2);
                    int sum = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(sum);
                }
            }
            
            pascalsTriangle.add(row);
        }
        
        return pascalsTriangle;
    }
}
