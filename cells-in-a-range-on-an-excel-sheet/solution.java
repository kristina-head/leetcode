class Solution {
    public List<String> cellsInRange(String s) {
        List<String> cells = new ArrayList<String>();
        
        for (char i = s.charAt(0); i <= s.charAt(3); i++) {
            for (char j = s.charAt(1); j <= s.charAt(4); j++ ) {
                String cell = Character.toString(i) + Character.toString(j);
                cells.add(cell);
            }
        }
        
        return cells;
    }
}
