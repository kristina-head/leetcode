class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) { // O(N)
        Map<Integer, List<Integer>> idsPerGroup = new HashMap<>(); // O(1)
        List<List<Integer>> groupedIds = new ArrayList<>(); // O(1)
        
        for (int i = 0; i < groupSizes.length; i++) { // O(N)
            List<Integer> group = new ArrayList<>(); // O(1)
            
            if (idsPerGroup.containsKey(groupSizes[i])) { // O(1)
                group = idsPerGroup.get(groupSizes[i]); // O(1)
            }
            
            group.add(i); // O(1)
            idsPerGroup.put(groupSizes[i], group); // O(1)
            
            if (group.size() == groupSizes[i]) { // O(1)
                groupedIds.add(group); // O(1)
                idsPerGroup.remove(groupSizes[i]); // O(1)
            }
        }
        
        return groupedIds; // O(1)
    }
}

