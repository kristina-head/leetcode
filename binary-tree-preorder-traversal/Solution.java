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
    public List<Integer> preorderTraversal(TreeNode root) { // O(N)
        List<Integer> result = new ArrayList<>(); // O(1)
        preorder(root, result); // O(N)
        
        return result; // O(1)
    }
    
    private void preorder(TreeNode current, List<Integer> result) { // O(N)
        if (current == null) return; // O(1)
        
        result.add(current.val); // O(1)
        preorder(current.left, result); // O(N / 2)
        preorder(current.right, result); // O(N / 2)
    }
}
