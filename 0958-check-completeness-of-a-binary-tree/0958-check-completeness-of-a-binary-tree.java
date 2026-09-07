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
    public boolean isCompleteTree(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
       boolean nullpointer = false;
        queue.offer(root);
        while(!queue.isEmpty()){
             TreeNode curr = queue.poll();
            if(curr==null){
                nullpointer = true;
            }
            else{
                if(nullpointer){
                    return false;
                }
                queue.offer(curr.left);
        queue.offer(curr.right);
            }
        }  
      return true;  
    }
}