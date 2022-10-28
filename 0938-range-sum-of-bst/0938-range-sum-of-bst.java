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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int result = 0;
        
        if(root.val <= high && root.val >= low) {
            result += root.val;
        }
        
        if(root.left != null) result += rangeSumBST(root.left, low, high);
        if(root.right != null) result += rangeSumBST(root.right, low, high);        
        
        return result;
    }
}