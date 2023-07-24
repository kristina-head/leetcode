class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int smallestIndex = Integer.MAX_VALUE;
        
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int index = j + map.get(list2[j]);
                
                if (index < smallestIndex) {
                    smallestIndex = index;
                    result.clear();
                    result.add(list2[j]);
                } else if (index == smallestIndex) {
                    result.add(list2[j]);
                }
            }
        }
        
        return result.toArray(String[]::new);
    }
}
