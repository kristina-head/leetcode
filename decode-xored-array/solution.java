class Solution {
    public int[] decode(int[] encoded, int first) { // O(N)
        int[] arr = new int[encoded.length+1]; // O(N)
        arr[0] = first; // O(1)
        
        for (int i = 0; i < encoded.length; i++) { // O(N)
            arr[i+1] = encoded[i] ^ arr[i]; // O(1)
        }
        
        return arr; // O(1)
    }
}
