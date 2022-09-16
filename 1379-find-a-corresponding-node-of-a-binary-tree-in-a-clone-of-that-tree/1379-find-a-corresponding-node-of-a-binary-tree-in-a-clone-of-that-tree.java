/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode node = new TreeNode();
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inOrder(cloned,target.val);
        
        return node;
    }
    
    public void inOrder(TreeNode root , int target) {
        if(root == null) return;
        
        inOrder(root.left , target);
        if(root.val == target) node = root;
        inOrder(root.right , target);

    }
}