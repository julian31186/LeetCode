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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(isSameTree(root,subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        
    }
    
    public boolean isSameTree(TreeNode root, TreeNode subroot) {
        if(subroot == null || root == null) return root == null && subroot == null;
        if(root.val != subroot.val) return false;
        
        return isSameTree(root.left,subroot.left) && isSameTree(root.right,subroot.right);
    }
    


  
    
}