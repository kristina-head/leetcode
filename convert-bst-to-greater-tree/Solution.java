/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution { // O(N)
    private int sum = 0; // O(1)
        
    public TreeNode convertBST(TreeNode root) { // O(N)
        sumNodes(root); // O(N)
        return root; // O(1)
    }
    
    private void sumNodes(TreeNode currentNode) { // O(N)
        if (currentNode == null) { // O(1)
            return; // O(1)
        }
        
        sumNodes(currentNode.right); // O(N)
        
        sum += currentNode.val; // O(1)
        currentNode.val = sum; // O(1)
        
        sumNodes(currentNode.left); // O(N)
    }
}
