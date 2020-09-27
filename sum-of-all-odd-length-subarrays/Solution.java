class Solution {
    public int sumOddLengthSubarrays(int[] arr) { 
        int total = 0; 
        int length = arr.length; 
        
        for (int i = 1; i <= length; i += 2) { 
            for (int j = 0; j <= length - i; j++) { 
                for (int k = 0; k < i; k++) { 
                    total += arr[j + k]; 
                }
            }
        }
        
        return total; 
    }
}
