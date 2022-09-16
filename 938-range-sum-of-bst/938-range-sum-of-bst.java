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
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        inOrder(root);
        System.out.println(list);
        
        int i = 0;
        while(list.get(i) != low) i++;
        
        
        while(list.get(i) != high)  {
           sum +=list.get(i);
           System.out.println(sum);
           i++;
        }
        
        sum += list.get(i);
        
        
        return sum;
    }
    
    public void inOrder(TreeNode root) {
        if(root == null) return;
        
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}