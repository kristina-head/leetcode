class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                count++;
                dfs(isConnected, i, visited);
            }
        }

        return count;
    }

    private void dfs(int[][] graph, int index, boolean[] visited) {
        int[] connections = graph[index];

        for (int i = 0; i < connections.length; i++) {
            if (!visited[i] && connections[i] == 1) {
                visited[i] = true;
                dfs(graph, i, visited);
            }
        }
    }
}
