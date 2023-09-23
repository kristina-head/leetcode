class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] visited = new boolean[n];
        List<Integer> unvisited = new ArrayList<>();

        for (int i = 0; i < edges.size(); i++) {
            int verticeWithIncomingEdge = edges.get(i).get(1);
            visited[verticeWithIncomingEdge] = true;
        }

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) unvisited.add(i);
        }

        return unvisited;
    }
}
