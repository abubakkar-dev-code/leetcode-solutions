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
    public int minDepth(TreeNode root) {
        return minHeight(root);
    }

    private static int minHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = minHeight(root.left);
        int rightHeight = minHeight(root.right);
        if(root.left==null) return 1+rightHeight;
        if(root.right==null) return 1+leftHeight;

        return 1 + Math.min(leftHeight, rightHeight);
    }
}