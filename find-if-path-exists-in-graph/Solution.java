class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) { // O(V + E) where V is the number of vertices and E is the number of edges in the graph
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>(); // O(1)
        Deque<Integer> queue = new ArrayDeque<>(); // O(1)
        boolean[] seen = new boolean[n]; // O(1)
        
        for (int[] edge : edges) { // O(E)
            graph.computeIfAbsent(edge[0], it -> new ArrayList<>()).add(edge[1]); // O(1)
            graph.computeIfAbsent(edge[1], it -> new ArrayList<>()).add(edge[0]); // O(1)
        }
        
        queue.addLast(source); // O(1)
        seen[source] = true; // O(1)
        
        while (!queue.isEmpty()) { // O(V + E)
            int current = queue.removeFirst(); // O(1)
            if (current == destination) return true; // O(1)
            
            ArrayList<Integer> vertices = graph.get(current); // O(1)
            for (int vertex : vertices) { // O(E)
                if (!seen[vertex]) { // O(1)
                    queue.addLast(vertex); // O(1)
                    seen[vertex] = true; // O(1)
                }
            }
        }
        
        return false; // O(1)
    }
}
