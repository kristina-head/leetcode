class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) { // O(E + V) where E is the number of edges and V is the number of vertices in the graph
        boolean[] visited = new boolean[n]; // O(1)
        List<Integer> unvisited = new ArrayList<>(); // O(1)

        for (int i = 0; i < edges.size(); i++) { // O(E)
            int verticeWithIncomingEdge = edges.get(i).get(1); // O(1)
            visited[verticeWithIncomingEdge] = true; // O(1)
        }

        for (int i = 0; i < visited.length; i++) { // O(V)
            if (!visited[i]) unvisited.add(i); // O(1)
        }

        return unvisited; // O(1)
    }
}
