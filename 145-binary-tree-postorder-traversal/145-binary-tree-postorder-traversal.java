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
    ArrayList<Integer> list = new ArrayList<>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        if(root == null) return list;
        
        while(!stack.isEmpty()) {
            TreeNode remove = stack.pop();
            
            list.add(0, remove.val);
            
            if(remove.left != null) stack.push(remove.left);
            
            if(remove.right != null) stack.push(remove.right);
            
            
            
            
        }
        
        
        
        return list;
    }
}