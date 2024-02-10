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
    public boolean isValidBST(TreeNode root) { // O(N)
        return dfs(root, null, null); // O(N)
    }
    
    private boolean dfs(TreeNode node, Integer lowerBound, Integer upperBound) { // O(N)
        if (node == null) return true; // O(1)
        
        boolean invalidLowerBound = lowerBound != null && lowerBound >= node.val; // O(1)
        boolean invalidUpperBound = upperBound != null && upperBound <= node.val; // O(1)
        if (invalidLowerBound || invalidUpperBound) return false; // O(1)
        
        return dfs(node.left, lowerBound, node.val) && dfs(node.right, node.val, upperBound); // O(N)
    }
}
