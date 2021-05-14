package com.nick.offer37;

/**
 * @author nick
 * @Classname Codec
 * @Description TODO
 * @Date 2021/5/7 9:21 下午
 * @Created by txiao
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("[");//prefix
        stringBuilder.append(root.val+",");
        a(root,stringBuilder);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");//suffix
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }

    public void a(TreeNode node,StringBuilder stringBuilder)
    {
        if(node==null)
        {
            return;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));