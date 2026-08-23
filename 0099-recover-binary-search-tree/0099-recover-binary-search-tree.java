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
    TreeNode previous = null;
       TreeNode present = null;
       TreeNode next = null;
    public void recoverTree(TreeNode root) {
       inorder(root);
        
            int temp = present.val;
            present.val = next.val;
            next.val = temp;
    }
    private void inorder(TreeNode root){
        if(root==null){
            return ;
        }
inorder(root.left);
       if(previous!=null && previous.val>root.val ){
        if(present==null){
            present = previous;
        }
        next = root;
       }
       previous = root;
       inorder(root.right);
      
    }
}