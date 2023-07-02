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
    public List<Integer> postorderTraversal(TreeNode root) { // O(N)
        List<Integer> result = new ArrayList<>(); // O(1)
        dfs(root, result); // O(N)
        
        return result; // O(1)
    }
    
    private void dfs(TreeNode current, List<Integer> result) { // O(N)
        if (current == null) return; // O(1)
        
        if (current.left != null) dfs(current.left, result);  // O(N / 2)
        if (current.right != null) dfs(current.right, result); // O(N / 2)
        result.add(current.val); // O(1)
    }
}
