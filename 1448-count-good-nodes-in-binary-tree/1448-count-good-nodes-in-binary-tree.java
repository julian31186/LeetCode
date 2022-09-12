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
    int goodNodes = 0;
    public int goodNodes(TreeNode root) {
        count(root, root.val);
        return goodNodes;
    }
    
    public void count(TreeNode root, int max) {
        if(root == null) return;
        
        if(root.val >= max) {
            max = root.val;
            goodNodes++;
        }
        
        count(root.left,max);
        count(root.right,max);
        
        
    }
    
    
}