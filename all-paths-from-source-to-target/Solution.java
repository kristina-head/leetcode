class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        
        dfs(0, graph, path, paths);
        
        return paths;
    }
    
    private void dfs(int current, int[][] graph, List<Integer> path, List<List<Integer>> paths) {
        path.add(current);
        
        if (current == graph.length - 1) {
            paths.add(new ArrayList<>(path));
            return;
        }
        
        int[] vertices = graph[current];
        for (int vertex : vertices) {
            dfs(vertex, graph, path, paths);
            path.remove(path.size() - 1);
        }
    }
}
