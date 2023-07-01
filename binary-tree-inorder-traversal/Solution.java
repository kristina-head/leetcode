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
    public List<Integer> inorderTraversal(TreeNode root) { // O(N)
        List<Integer> result = new ArrayList<>(); // O(1)
        dfs(root, result); // O(N)
        
        return result; // O(1)
    }
    
    private void dfs(TreeNode node, List<Integer> result) { // O(N)
        if (node == null) return; // O(1)
        
        dfs(node.left, result); // O(N / 2)
        result.add(node.val); // O(1)
        dfs(node.right, result); // O(N / 2)
    }
}
