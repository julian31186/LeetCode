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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 1;
        
        List<Integer> level = new ArrayList<>();
        List<Integer> sums = new ArrayList<>();
        
        

        
        if(root == null) return 0;
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                sum += remove.val;
                if(remove.left != null) queue.add(remove.left);
                if(remove.right != null) queue.add(remove.right); 
            }
            level.add(count++);
            sums.add(sum);
           
        }
        System.out.println(sums);
         System.out.println(level);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < sums.size(); i++) {
            max = Math.max(max, sums.get(i));
        }
        

        
        return level.get(sums.indexOf(max));
    }
        
    
}