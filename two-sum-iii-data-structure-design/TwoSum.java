class TwoSum {
    private Map<Integer, Integer> numCount;
    
    public TwoSum() { // O(1)
        this.numCount = new HashMap<>();
    }
    
    public void add(int number) { // O(1)
        int count = this.numCount.getOrDefault(number, 0);
        this.numCount.put(number, count + 1);
    }
    
    public boolean find(int value) { // O(N) where N is the number of entries in the Map
        for (Map.Entry<Integer, Integer> entry : this.numCount.entrySet()) {
            int complement = value - entry.getKey();
            
            if (complement != entry.getKey()) {
                if (this.numCount.containsKey(complement)) return true;
            } else {
                if (entry.getValue() > 1) return true;
            }
        }
        
        return false;
    }
}
