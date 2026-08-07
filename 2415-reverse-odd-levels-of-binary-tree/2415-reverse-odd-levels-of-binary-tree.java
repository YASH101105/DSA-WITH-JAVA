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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null){
            return null;
        }
         tranverse(root.left,root.right,0);
         return root;
    }
    private void tranverse(TreeNode leftroot , TreeNode rightroot , int level){
        if(leftroot==null || rightroot ==null){
            return ;
        }
        if(level%2==0){
           int temp = leftroot.val;
           leftroot.val = rightroot.val;
           rightroot.val = temp;
        }
        tranverse(leftroot.left , rightroot.right , level+1);
        tranverse(leftroot.right , rightroot.left , level+1);
    }
}