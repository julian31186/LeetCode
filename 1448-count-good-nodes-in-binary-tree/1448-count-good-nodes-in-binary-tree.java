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
    //retry RECURSIVE WAY
    
    class NodePair {
        TreeNode node = null;
        int maxVal = 0;
        
        
        public NodePair(TreeNode node, int maxVal) {
            this.node = node;
            this.maxVal = maxVal;
        }
    }

    public int goodNodes(TreeNode root) {
        int goodNodes = 0;
        Stack<NodePair> stack = new Stack<>();
        stack.push(new NodePair(root, root.val));
        
        
        while(!stack.isEmpty()) {
            NodePair top = stack.pop();
            TreeNode current = top.node;
            int max =  top.maxVal; 
            
            if(current.val >= max) {
                goodNodes++;
                max = current.val;
            }
            
            if(current.left != null) {
                stack.push(new NodePair(current.left, max));
            }
            
            if(current.right != null) {
                stack.push(new NodePair(current.right, max));
            }
            
        }
        
        return goodNodes;
    }
   
    
}