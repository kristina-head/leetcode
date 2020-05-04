class Solution {
    public String destCity(List<List<String>> paths) { // O(N)
        Set<String> cityA = new HashSet<>(); // O(1)
        Set<String> cityB = new HashSet<>(); // O(1)
        
        for (int i = 0; i < paths.size(); i++) { // O(N)
            cityA.add(paths.get(i).get(0)); // O(1)
            cityB.add(paths.get(i).get(1)); // O(1)
        }
                
        cityB.removeAll(cityA); // O(N)
        String destination = ""; // O(1)
        
        for (String city : cityB) { // O(1)
            destination = city; // O(1)
        }
        
        return destination; // O(1)
    }
}
