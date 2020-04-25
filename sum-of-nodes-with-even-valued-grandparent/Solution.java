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
    private int sum = 0; // O(1)
    
    private void traverseTree(TreeNode currentNode, TreeNode parent, TreeNode grandparent) { // O(N)
        if (currentNode == null) { // O(1)
            return; // O(1)
        }
        
        if (grandparent != null && (grandparent.val & 1) == 0) { // O(1)
            sum += currentNode.val; // O(1)
        }
        
        traverseTree(currentNode.left, currentNode, parent); // O(N)
        traverseTree(currentNode.right, currentNode, parent); // O(N)
    }
    
    public int sumEvenGrandparent(TreeNode root) { // O(N)
        traverseTree(root, null, null); // O(N)
        return sum; // O(1)
    }
}
