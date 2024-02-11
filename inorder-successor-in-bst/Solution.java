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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) { // O(log N) for a balanced tree. O(N) for an unbalanced tree
        TreeNode successor = null; // O(1)

        while (root != null) { // O(log N) or O(N) depending on tree structure
            if (root.val <= p.val) { // O(1)
                root = root.right; // O(1)
            } else {
                successor = root; // O(1)
                root = root.left; // O(1)
            }
        }

        return successor; // O(1)
    }
}
