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
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root,root.val);
    }
    
    public int countGoodNodes(TreeNode root, int maxSoFar) {
        int goodNodes = 0;        
        if(root == null) return 0;
        
        if(root.val >= maxSoFar) {
            maxSoFar = root.val;
            goodNodes++;
        }
        
        goodNodes += countGoodNodes(root.left, maxSoFar);
        goodNodes += countGoodNodes(root.right, maxSoFar);
        
        return goodNodes;
    }
}