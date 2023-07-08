/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class RecursiveSolution {
    public List<List<Integer>> levelOrder(TreeNode root) { // O(N)
        List<List<Integer>> levels = new ArrayList<>(); // O(1)
        
        addLevels(root, 0, levels); // O(N)
        
        return levels; // O(1)
    }
    
    private void addLevels(TreeNode current, int index, List<List<Integer>> levels) { // O(N)
        if (current == null) return; // O(1)
        if (levels.size() == index) levels.add(new ArrayList<>()); // O(1)

        levels.get(index).add(current.val); // O(1)

        addLevels(current.left, index + 1, levels); // O(N / 2)
        addLevels(current.right, index + 1, levels); // O(N / 2)
    }
}
