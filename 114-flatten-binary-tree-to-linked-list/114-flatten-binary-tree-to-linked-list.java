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
    public void flatten(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode dummy = new TreeNode(0);

        while(!stack.isEmpty()) {
            TreeNode remove = stack.pop();
            
            dummy.right = remove;
            dummy.left = null;
            dummy = dummy.right;
            
            if(remove.right != null) stack.add(remove.right);
            if(remove.left != null) stack.add(remove.left);
            
            
        }
        
        root = dummy.right;
        
    }
}