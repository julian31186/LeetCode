class Solution {
    
      ArrayList<Integer> list = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        
        while(true) {
            if(root != null) {
                stack.push(root);
                root = root.left;
                
            } else {
                if(stack.isEmpty()) break;
                root = stack.pop();
                list.add(root.val);
                root = root.right;
                
            }     
        }

        
        return list;
    }
}
        
        
        
        
    
  