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
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, 0, preorder.length - 1);
    }
    
    private TreeNode construct(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
                
        TreeNode root = new TreeNode(preorder[left]);
        
        int i;
        for (i = left; i <= right; i++) {
            if (preorder[i] > root.val) {
                break;
            }
        }
        
        root.left = construct(preorder, left + 1, i - 1);
        root.right = construct(preorder, i, right);
        
        return root;
    }
}
