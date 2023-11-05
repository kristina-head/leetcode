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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        getValues(root, values);
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < values.size(); i++) {
            minDiff = Math.min(minDiff, values.get(i) - values.get(i - 1));
        }

        return minDiff;
    }

    /**
     * Performs an in order traversal so values are added in ascending order.
     */
    private void getValues(TreeNode node, List<Integer> values) {
        if (node == null) return;

        getValues(node.left, values);
        values.add(node.val);
        getValues(node.right, values);
    }
}
