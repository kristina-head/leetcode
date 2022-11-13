class Solution {
    public List<String> cellsInRange(String s) { // O(N*M)
        List<String> cells = new ArrayList<String>(); // O(1)
        
        for (char i = s.charAt(0); i <= s.charAt(3); i++) { // O(N*M)
            for (char j = s.charAt(1); j <= s.charAt(4); j++ ) { // O(M)
                String cell = Character.toString(i) + Character.toString(j); // O(1)
                cells.add(cell); // O(1)
            }
        }
        
        return cells; // O(1)
    }
}
