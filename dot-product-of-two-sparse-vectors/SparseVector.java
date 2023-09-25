/**
 * A sparse vector is a vector that has mostly zero values.
 */
class SparseVector {
    private Map<Integer, Integer> compressedVector;
    
    /**
     * Because the vector is sparse, initializes a Map to only store the indices and values of non-zero numbers.
     */
    SparseVector(int[] nums) { // O(N)
        this.compressedVector = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                this.compressedVector.put(i, nums[i]);
            }
        }
    }
    
    /**
     * Returns the dotProduct of two sparse vectors.
     */
    public int dotProduct(SparseVector vec) { // O(M)
        int product = 0;

        for (Integer i : this.compressedVector.keySet()) {
            if (vec.compressedVector.containsKey(i)) {
                product += this.compressedVector.get(i) * vec.compressedVector.get(i);
            }
        }

        return product;
    }
}
