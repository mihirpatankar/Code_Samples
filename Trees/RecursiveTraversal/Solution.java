/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//1.inOrder --> Left - Print -right
//2.preOrder --> Print - Left -right
//3.postOrder --> Left -Right -Print
class Solution{
  public void inOrder(TreeNode root){
    if(root!=null){
      inOrder(root.left);
      System.out.println(root.val);
      inOrder(root.right);
    }
  }

  public void preOrder(TreeNode root){
    if(root!=null){
      System.out.println(root.val);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  public void postOrder(TreeNode root){
    if(root!=null){
      postOrder(root.left);
      postOrder(root.right);
      System.out.println(root.val);
    }
  }
}
