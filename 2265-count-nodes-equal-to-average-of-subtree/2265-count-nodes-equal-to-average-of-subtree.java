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
    int count = 0;
    int total = 0;
    
    
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int counter = 0;
        queue.add(root);
        while(!queue.isEmpty()) {
            total = 0;
            count = 0;
            
            TreeNode remove = queue.remove();
            average(remove);
            System.out.println(total / count);
            if(remove.val == (total / count)) counter++;
            
            if(remove.left != null) queue.add(remove.left);
            if(remove.right != null) queue.add(remove.right);
        }
        
        return counter;
    }
    
    public void average(TreeNode root) {
        if(root == null) return;
        average(root.left);
        total += root.val;
        count ++;
        average(root.right);
    }
    

    
}