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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> means = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList(); 
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
             
            for(int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                sum += remove.val;
                
                
                
                 if(remove.left != null)  {
                    queue.add(remove.left);
                    }
                if(remove.right != null)  {
                queue.add(remove.right);
                    }
            }
            
            means.add((sum / (double) size));
            
            
           
        }
        return means;
    }
}