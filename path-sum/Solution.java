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
    public boolean hasPathSum(TreeNode root, int targetSum) { // O(N)
        if (root == null) return false; // O(1)
        
        targetSum -= root.val; // O(1)

        if (root.left == null && root.right == null) return targetSum == 0; // O(1)
        
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum); // O(N / 2) + O(N / 2) -> O(N)
    }
}
