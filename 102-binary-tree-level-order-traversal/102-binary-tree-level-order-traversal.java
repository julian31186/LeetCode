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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> lists = new ArrayList<>();
        
        if(root == null) return lists;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> sublist = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                sublist.add(remove.val);
                
                if(remove.left != null) queue.add(remove.left);
                if(remove.right != null) queue.add(remove.right);
            }
            lists.add(sublist);
            
        }
            return lists;
    }
}