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
    public List<Integer> rightSideView(TreeNode root) {
        //do again with q siolution and as u type udnerstand the process
        
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                if(i == 0) list.add(remove.val);
                if(remove.right != null) queue.add(remove.right);
                if(remove.left != null) queue.add(remove.left);
                
            }
        }
        
        return list;
    }
}