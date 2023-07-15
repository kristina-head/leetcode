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
    public int maxDepth(TreeNode root) { // O(N)
        if (root == null) return 0; // O(1)
       
        int leftDepth = maxDepth(root.left); // O(N / 2)
        int rightDepth = maxDepth(root.right); // O(N / 2)
        
        return Math.max(leftDepth, rightDepth) + 1; // O(1)
    }
}
