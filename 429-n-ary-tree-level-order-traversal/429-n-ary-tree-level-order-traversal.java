/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        while(!queue.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node remove = queue.remove();
                sublist.add(remove.val);
                queue.addAll(remove.children);
            }
            list.add(sublist);
        }
       
        return list;
    }
}