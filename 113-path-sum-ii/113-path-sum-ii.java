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
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        dfs(root, targetSum, list);
        return ans;
    }
    
    public void dfs(TreeNode root, int sum, List<Integer> list) {
        if(root == null) return;
        
        list.add(root.val);
        if(root.val == sum && root.left == null && root.right == null) {
            ans.add(list);
        }
        
        dfs(root.left, sum - root.val, new ArrayList<>(list));
        dfs(root.right, sum - root.val, new ArrayList<>(list));
    }
}