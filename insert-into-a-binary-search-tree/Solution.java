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
    public TreeNode insertIntoBST(TreeNode root, int val) { // O(log N)
        if (root == null) { // O(1)
            return new TreeNode(val); // O(1)
        }
        
        if (val < root.val) { // O(1)
            root.left = insertIntoBST(root.left, val); // O(log N)
        } else {
            root.right = insertIntoBST(root.right, val); // O(log N)
        }
        
        return root; // O(1)
    }
}    

