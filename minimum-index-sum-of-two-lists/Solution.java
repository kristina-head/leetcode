class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) { // O(N + M) where N is list1.length and M is list2.length
        Map<String, Integer> map = new HashMap<>(); // O(1)
        List<String> result = new ArrayList<>(); // O(1)
        int smallestIndex = Integer.MAX_VALUE; // O(1)
        
        for (int i = 0; i < list1.length; i++) { // O(N)
            map.put(list1[i], i); // O(1)
        }
        
        for (int j = 0; j < list2.length; j++) { // O(M)
            if (map.containsKey(list2[j])) { // O(1)
                int index = j + map.get(list2[j]); // O(1)
                
                if (index < smallestIndex) { // O(1)
                    smallestIndex = index; // O(1)
                    result.clear(); // O(N) worst case result contains all Strings from list1
                    result.add(list2[j]); // O(1)
                } else if (index == smallestIndex) { // O(1)
                    result.add(list2[j]); // O(1)
                }
            }
        }
        
        return result.toArray(String[]::new); // O(N) worst case result contains all Strings from list1
    }
}
