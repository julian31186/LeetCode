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
    boolean flag = false;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        flag = dfs(root,targetSum);
        return flag;
    }
    
    public boolean dfs(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.val == targetSum && root.left == null && root.right == null) return true;

        return dfs(root.left, targetSum - root.val) || dfs(root.right, targetSum - root.val);
        
        
    }
}