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
    public int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                list.add(remove.val);
                if(remove.left!= null) queue.add(remove.left);
                if(remove.right!= null) queue.add(remove.right);
                
            }
            lists.add(list);
        }
        
        int sum = 0;
        for(int i = 0; i < lists.get(lists.size()-1).size(); i++) {
            sum += lists.get(lists.size()-1).get(i);
        }
        
        return sum;
        
        
    }
}