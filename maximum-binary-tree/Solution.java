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
    public TreeNode constructMaximumBinaryTree(int[] nums) { // O(N log N)
        return construct(nums, 0, nums.length); // O(N log N)
    }
    
    private int findMax(int[] nums, int left, int right) { // O(N)
        int max = left; // O(1)
        
        for (int i = left; i < right; i++) { // O(N)
            if (nums[max] < nums[i]) { // O(1)
                max = i; // O(1)
            }
        }
        
        return max; // O(1)
    }
    
    private TreeNode construct(int[] nums, int left, int right) { // O(N log N)
        if (left == right) { // O(1)
            return null; // O(1)
        }
        
        int max = findMax(nums, left, right); // O(N)
        TreeNode root = new TreeNode(nums[max]); // O(1)
        root.left = construct(nums, left, max); // O(log N)
        root.right = construct(nums, max+1, right); // O(log N)
        
        return root; // O(1)
    }
}
