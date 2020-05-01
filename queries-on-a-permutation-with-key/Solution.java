class Solution {
    public int[] processQueries(int[] queries, int m) { // O(N^2)
        List<Integer> permutations = IntStream.rangeClosed(1, m) 
            .boxed() 
            .collect(Collectors.toList()); // O(M)
        int size = queries.length; // O(1)
        int[] positions = new int[size]; // O(N)
        
        for (int i = 0; i < size; i++) { // O(N^2)
            positions[i] = permutations.indexOf((Integer)queries[i]); // O(N)
            permutations.remove((Integer)queries[i]); // O(N)
            permutations.add(0, queries[i]); // O(N)
        }
        
        return positions; // O(1)
    }
}
