class ParkingSystem {
    int[] slots = new int[3]; // O(1)
    
    public ParkingSystem(int big, int medium, int small) { // O(1)
        this.slots[0] = big; // O(1)
        this.slots[1] = medium; // O(1)
        this.slots[2] = small; // O(1)
    }
    
    public boolean addCar(int carType) { // O(1)
        int i = carType - 1; // O(1)
        if (slots[i] > 0) { // O(1)
            slots[i]--; // O(1)
            return true; // O(1)
        }
        return false; // O(1)
    }
}
