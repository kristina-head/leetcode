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
    public int getMinimumDifference(TreeNode root) { // O(N)
        List<Integer> values = new ArrayList<>(); // O(1)
        getValues(root, values); // O(N)
        
        int minDiff = Integer.MAX_VALUE; // O(1)
        for (int i = 1; i < values.size(); i++) { // O(N)
            minDiff = Math.min(minDiff, values.get(i) - values.get(i - 1)); // O(1)
        }

        return minDiff; // O(1)
    }

    /**
     * Performs an in order traversal so values are added in ascending order.
     */
    private void getValues(TreeNode node, List<Integer> values) { // O(N)
        if (node == null) return; // O(1)

        getValues(node.left, values); // O(N / 2)
        values.add(node.val); // O(1)
        getValues(node.right, values); // O(N / 2)
    }
}
