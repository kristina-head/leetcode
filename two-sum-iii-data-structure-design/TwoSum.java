class TwoSum {
    private Map<Integer, Integer> numCount;
    
    public TwoSum() {
        this.numCount = new HashMap<>();
    }
    
    public void add(int number) {
        int count = this.numCount.getOrDefault(number, 0);
        this.numCount.put(number, count + 1);
    }
    
    public boolean find(int value) {       
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
