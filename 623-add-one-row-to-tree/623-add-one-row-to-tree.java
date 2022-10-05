
class Solution {
    /*
    class Pair {
        int depth;
        TreeNode node;
        
        public Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    */
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        
        if (depth == 1) {
            TreeNode temp = root;
            root = new TreeNode(val);
            root.left = temp;
            return root;
        }
        
        
        while(!queue.isEmpty()) {    
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                if(level == depth-1) {
                    TreeNode oldLeft = remove.left;
                    TreeNode oldRight =remove.right;
                    remove.left = new TreeNode(val);
                    remove.right = new TreeNode(val);
                    remove.left.left = (oldLeft == null) ?  null : oldLeft;
                    remove.right.right = (oldRight == null) ?  null : oldRight;
                }
                
                if(remove.left != null) queue.add(remove.left);
                if(remove.right != null) queue.add(remove.right);
            }
            level += 1;
        }
        return root;
    }
}