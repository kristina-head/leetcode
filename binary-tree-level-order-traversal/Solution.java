class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) { // O(N)
        List<List<Integer>> levels = new ArrayList<>(); // O(1)
        if (root == null) return levels; // O(1)
        
        Deque<TreeNode> queue = new ArrayDeque<>(); // O(1)
        queue.addLast(root); // O(1)
        
        while (!queue.isEmpty()) { // O(N)
            List<Integer> level = new ArrayList<>(); // O(1)
            int length = queue.size(); // O(1)
            
            for (int i = 0; i < length; i++) { // O(N)
                TreeNode current = queue.removeFirst(); // O(1)
                
                level.add(current.val); // O(1)
                
                if (current.left != null) queue.addLast(current.left); // O(1)
                if (current.right != null) queue.addLast(current.right); // O(1)
            }
            
            levels.add(level); // O(1)
        }
        
        return levels; // O(1)
    }
}
