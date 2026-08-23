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

    TreeNode curr = new TreeNode();

    public TreeNode increasingBST(TreeNode root) {

        TreeNode dummy = curr;

        inorder(root);

        return dummy.right;
    }

    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        curr.right = root;
        root.left = null;
        curr = root;

        inorder(root.right);
    }
}