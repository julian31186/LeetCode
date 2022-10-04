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
        dfs(root, targetSum);
        return flag;        
    }
    
    public void dfs(TreeNode root, int sum) {
        if(root == null) return;
        if(root.left == null && root.right == null && sum == root.val) {
            flag = true;  
        }
        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);
        
    }
    
  
    
}