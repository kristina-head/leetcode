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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        
        addLevels(root, 0, levels);
        
        return levels;
    }
    
    private void addLevels(TreeNode current, int index, List<List<Integer>> levels) {
        if (current == null) return;
        if (levels.size() == index) levels.add(new ArrayList<>());

        levels.get(index).add(current.val);

        addLevels(current.left, index + 1, levels);
        addLevels(current.right, index + 1, levels);
    }
}
