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
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0 ; 
        }
        if (root.left == null && root.right == null){
            return 1; 
        }
        int left_length = 0 , right_length = 0 ;
        if (root.left != null){
        left_length = maxDepth(root.left);
        }
        if (root.right != null){
        right_length = maxDepth(root.right);
        }

        return 1 + Math.max(left_length,right_length);
    }
}