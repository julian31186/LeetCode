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
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int sum = 0;        
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode remove = queue.remove();
            if(remove.val % 2 == 0 && remove.left != null && remove.left.left != null) sum += remove.left.left.val;
            if(remove.val % 2 == 0 && remove.left != null && remove.left.right != null) sum += remove.left.right.val;
            
            
            if(remove.val % 2 == 0 && remove.right != null && remove.right.right != null) sum += remove.right.right.val;
            if(remove.val % 2 == 0 && remove.right != null && remove.right.left != null) sum += remove.right.left.val;
            
            if(remove.left != null) queue.add(remove.left);
            if(remove.right != null) queue.add(remove.right);
        }
        
        return sum;
        
    }
}