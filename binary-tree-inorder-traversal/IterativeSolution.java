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
class IterativeSolution {
    public List<Integer> inorderTraversal(TreeNode root) { // O(N)
        List<Integer> result = new ArrayList<>(); // O(1)
        Deque<TreeNode> stack = new ArrayDeque<>(); // O(1)
        
        while (root != null || !stack.isEmpty()) { // O(N)
            while (root != null) { // O(N)
                stack.push(root); // O(1)
                root = root.left; // O(1)
            }
            
            root = stack.pop(); // O(1)
            result.add(root.val); // O(1)
            root = root.right; // O(1)
        }
        
        return result; // O(1)
    }
}
