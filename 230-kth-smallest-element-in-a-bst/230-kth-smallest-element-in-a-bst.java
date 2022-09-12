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
    ArrayList<Integer> queue = new ArrayList<>();
    
    public int kthSmallest(TreeNode root, int k) {
        // 1 2 3 4
        
        inOrder(root);
        Collections.sort(queue);
        
        return queue.get(k-1);
    }
    
    public void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        queue.add(root.val);
        inOrder(root.right);
        
    }
}