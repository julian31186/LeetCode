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
    //retry RECURSIVE WAY
    


    public int goodNodes(TreeNode root) {
        return countNodes(root,root.val);
        //retry recursive DFS approach
    }
    
    public int countNodes(TreeNode root, int max) {
        int goodNodes = 0;
        if(root == null) return 0;
        if(root.val >= max) {
            goodNodes++;
            max = root.val;
        }
            
        goodNodes += countNodes(root.left, max);
        goodNodes += countNodes(root.right, max);
            
            
        return goodNodes;
    }
    
    
}