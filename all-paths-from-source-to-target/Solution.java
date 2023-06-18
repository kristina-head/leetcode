class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) { // O(2^N * N) where N is the number of vertices in the graph
        List<List<Integer>> paths = new ArrayList<>(); // O(1)
        List<Integer> path = new ArrayList<>(); // O(1)
        
        dfs(0, graph, path, paths); // O(2^N)
        
        return paths; // O(1)
    }
    
    private void dfs(int current, int[][] graph, List<Integer> path, List<List<Integer>> paths) { // O(2^N)
        path.add(current); // O(1)
        
        if (current == graph.length - 1) { // O(1)
            paths.add(new ArrayList<>(path)); // O(N)
            return; // O(1)
        }
        
        int[] vertices = graph[current]; // O(1)
        for (int vertex : vertices) { // O(N)
            dfs(vertex, graph, path, paths); // O(2^N)
            path.remove(path.size() - 1); // O(1)
        }
    }
}
