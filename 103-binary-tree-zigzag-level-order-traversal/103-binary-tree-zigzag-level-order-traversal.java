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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean flag = true;
        
        
        ArrayList<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        if(root == null) return lists;
        
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                if(remove.left != null) queue.add(remove.left);
                if(remove.right != null) queue.add(remove.right);
                
                if(flag) {
                    arr.add(remove.val);
                } else {
                    arr.add(0, remove.val);
                }
                
            } 
            
            
                
            lists.add(arr);
            flag = !flag;
            }
            
        
        
        
        return lists;
        
    }
}