class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int length = queue.size();
            
            for (int i = 0; i < length; i++) {
                TreeNode current = queue.removeFirst();
                
                level.add(current.val);
                
                if (current.left != null) queue.addLast(current.left);
                if (current.right != null) queue.addLast(current.right);
            }
            
            levels.add(level);
        }
        
        return levels;
    }
}
