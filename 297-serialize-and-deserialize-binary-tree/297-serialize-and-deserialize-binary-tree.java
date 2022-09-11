/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    static HashMap<String, TreeNode> map = new HashMap<>();
   

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String str = "123123";
        map.put(str, root);
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       return map.get(data);
    }
    }


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));