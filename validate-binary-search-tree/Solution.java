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
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }
    
    private boolean dfs(TreeNode node, Integer lowerBound, Integer upperBound) {
        if (node == null) return true;
        
        boolean invalidLowerBound = lowerBound != null && lowerBound >= node.val;
        boolean invalidUpperBound = upperBound != null && upperBound <= node.val;
        if (invalidLowerBound || invalidUpperBound) return false;
        
        return dfs(node.left, lowerBound, node.val) && dfs(node.right, node.val, upperBound);
    }
}
