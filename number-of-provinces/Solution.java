class Solution {
    public int findCircleNum(int[][] isConnected) { // O(N^2) where N is the number of vertices in the graph
        boolean[] visited = new boolean[isConnected.length]; // O(N)
        int count = 0; // O(1)
        
        for (int i = 0; i < isConnected.length; i++) { // O(N)
            if (!visited[i]) { // O(1)
                visited[i] = true; // O(1)
                count++; // O(1)
                dfs(isConnected, i, visited); // O(N)
            }
        }

        return count; // O(1)
    }

    private void dfs(int[][] graph, int index, boolean[] visited) { // O(N)
        int[] connections = graph[index]; // O(1)

        for (int i = 0; i < connections.length; i++) { // O(N)
            if (!visited[i] && connections[i] == 1) { // O(1)
                visited[i] = true; // O(1)
                dfs(graph, i, visited); // O(N)
            }
        }
    }
}
