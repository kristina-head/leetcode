/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
        int currentDepth = 0; // O(1)
        int maxDepth = 0; // O(1)
        int sum = 0; // O(1)
        
    public int deepestLeavesSum(TreeNode root) { // O(N)
        findMaxDepthSum(root, 0); // O(N)
        return sum; // O(1)
    }
    
    private void findMaxDepthSum(TreeNode root, int currentDepth) { // O(N)
        if (root == null) { // O(1)
            return; // O(1)
        }
        
        if (currentDepth > maxDepth) { // O(1)
            maxDepth = currentDepth; // O(1)
            sum = root.val; // O(1)
        } else if (currentDepth == maxDepth) { // O(1)
            sum += root.val; // O(1)
        }
        
        findMaxDepthSum(root.left, currentDepth + 1); // O(N)
        findMaxDepthSum(root.right, currentDepth + 1); // O(N)
    }
}
