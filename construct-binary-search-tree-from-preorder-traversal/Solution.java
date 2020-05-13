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
    public TreeNode bstFromPreorder(int[] preorder) { // O(N log N)
        return construct(preorder, 0, preorder.length - 1); // O(N log N)
    }
    
    private TreeNode construct(int[] preorder, int left, int right) { // O(N log N)
        if (left > right) { // O(1)
            return null; // O(1)
        }
                
        TreeNode root = new TreeNode(preorder[left]); // O(1)
        
        int i; // O(1)
        for (i = left; i <= right; i++) { // O(N)
            if (preorder[i] > root.val) { // O(1)
                break; 
            }
        }
        
        root.left = construct(preorder, left + 1, i - 1); // O(log N)
        root.right = construct(preorder, i, right); // O(log N)
        
        return root; // O(1)
    }
}
