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
    public List<Integer> getLonelyNodes(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode remove = q.remove();
            isLonely(remove);
            if(remove.left != null) q.add(remove.left);
            if(remove.right != null) q.add(remove.right);   
        }
        return list;
    }
    
    public void isLonely(TreeNode root) {
        if(root == null) return;
        
        if(root.left != null && root.right == null) list.add(root.left.val);
        
        if(root.left == null && root.right != null) list.add(root.right.val);
    }
}