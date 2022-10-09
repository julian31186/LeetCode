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
    public boolean findTarget(TreeNode root, int k) {
        bfs(root);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //hashmap approach, iterate over index and subtract target - list.get(i), if map contains the remaining, then return both indexes, other wise store value and index within hash map.
        
        for(int i = 0; i < list.size(); i++) {
            int val = k - list.get(i);
            if(map.containsKey(val)) return true;
            else map.put(list.get(i),i);
        }

            
        return false;
    }
    public void bfs(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode remove = q.remove();
            list.add(remove.val);
            
            if(remove.left != null) q.add(remove.left);
            if(remove.right != null) q.add(remove.right);
        }
    }
}