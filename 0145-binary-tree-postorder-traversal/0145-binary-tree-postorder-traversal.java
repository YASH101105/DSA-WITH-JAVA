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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> Tree = new ArrayList<>();
        Postorder(root , Tree);
        return Tree;
    }
    private void Postorder(TreeNode root,List<Integer> Tree){
        if(root==null){
            return;
        }
        Postorder(root.left, Tree);
        Postorder(root.right, Tree);
        Tree.add(root.val);
    }
}