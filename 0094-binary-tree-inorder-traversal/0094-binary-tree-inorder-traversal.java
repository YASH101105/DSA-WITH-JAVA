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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> Tree = new ArrayList<>();
        Inorder(root,Tree);
        return Tree;
    }
    private void Inorder(TreeNode root,List<Integer> Tree ){
        if(root==null){
            return ;
        }
        Inorder(root.left , Tree);
       Tree.add(root.val);//Adding the value of the root(the value of the node)
         Inorder(root.right, Tree);
    }
}