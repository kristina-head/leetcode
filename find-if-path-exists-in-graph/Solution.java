class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] seen = new boolean[n];
        
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], it -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], it -> new ArrayList<>()).add(edge[0]);
        }
        
        queue.addLast(source);
        seen[source] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.removeFirst();
            if (current == destination) return true;
            
            ArrayList<Integer> vertices = graph.get(current);
            for (int vertex : vertices) {
                if (!seen[vertex]) {
                    queue.addLast(vertex);
                    seen[vertex] = true;
                }
            }
        }
        
        return false;
    }
}
