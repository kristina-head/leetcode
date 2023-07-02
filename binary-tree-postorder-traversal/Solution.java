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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        
        return result;
    }
    
    private void dfs(TreeNode current, List<Integer> result) {
        if (current == null) return;
        
        if (current.left != null) dfs(current.left, result);
        if (current.right != null) dfs(current.right, result);
        result.add(current.val);
    }
}
