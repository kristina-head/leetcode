class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> indicesByNum = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            if (indicesByNum.containsKey(num)) {
                List<Integer> indices = indicesByNum.get(num);
                
                for (int j : indices) {
                    if (Math.abs(i - j) <= k) return true;
                }
                
                indices.add(i);
            } else {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                indicesByNum.put(num, indices);
            }
        }
        
        return false;
    }
}
