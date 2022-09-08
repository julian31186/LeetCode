class Solution {
    
    ArrayList<Integer> list = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
    }
    
    public void inOrder(TreeNode root) {
        if(root == null) return;
        
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}