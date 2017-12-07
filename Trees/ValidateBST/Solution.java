/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution{
  private boolean isBSTHelper(TreeNode root,long min, long max){
    if(root==null){
      return true;
    }
    if(root.val < min || root.val > max){
      return false;
    }
    return isBSTHelper(root.left,min, root.val) && isBSTHelper(root.right,root.val,max);
  }
  public boolean isBST(TreeNode root){
    if(isBSTHelper(root,Long.MIN_VALUE,Long.MAX_VALUE)){
      return true;
    }
    return false;
  }
}
