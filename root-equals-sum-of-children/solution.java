class Solution {
    public boolean checkTree(TreeNode root) { // O(1)
        return root.val == root.left.val + root.right.val; // O(1)
    }
}
