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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) { // O(N)
        if (original == null) { // O(1)
            return null; // O(1)
        }
        
        if (original == target) { // O(1)
            return cloned; // O(1)
        }
        
        TreeNode left = getTargetCopy(original.left, cloned.left, target); // O(N)
        
        if (left != null) { // O(1)
            return left; // O(1)
        } else {
            return getTargetCopy(original.right, cloned.right, target); // O(N)
        }
    }
}
