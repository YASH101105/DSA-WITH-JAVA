class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {

                TreeNode curr = queue.poll();

                if (!reverse) {
                    currLevel.add(curr.val);
                } else {
                    currLevel.add(0, curr.val);
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            ans.add(currLevel);
            reverse = !reverse;
        }

        return ans;
    }
}