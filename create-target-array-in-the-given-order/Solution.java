class Solution {
    public int[] createTargetArray(int[] nums, int[] index) { // O(N*M)
        List<Integer> list = new ArrayList<Integer>(); // O(N)
        
        for (int i = 0; i < index.length; i++) { // O(N*M)
            list.add(index[i], nums[i]); // O(M)
        }
        
        int[] target = new int[index.length]; // O(N)
        
        for (int i = 0; i < index.length; i++) { // O(N)
            target[i] = list.get(i); // O(1)
        }
        
        return target; // O(1)
    }
}
