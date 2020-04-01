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
    public int rangeSumBST(TreeNode root, int L, int R) { // O(N)
        if (root == null) { // O(1)
            return 0; // O(1)
        } 
        if (root.val > R) { // O(1)
            return rangeSumBST(root.left, L, R);
        }
        if (root.val < L) { // O(1)
            return rangeSumBST(root.right, L, R);
        }
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
