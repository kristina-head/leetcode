class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> numbers = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (numbers.contains(arr[i] * 2) || (arr[i] % 2 == 0 && numbers.contains(arr[i] / 2))) {
                return true;
            }
            numbers.add(arr[i]);
        }
        
        return false;
    }
}
