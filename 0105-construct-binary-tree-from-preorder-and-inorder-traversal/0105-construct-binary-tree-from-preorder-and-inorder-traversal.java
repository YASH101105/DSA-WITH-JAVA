class Solution {

    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(preorder, 0, inorder.length - 1, map);
    }

    public TreeNode helper(int[] preorder, int left, int right,
                           HashMap<Integer, Integer> map) {

        // No elements
        if (left > right) {
            return null;
        }

        // Preorder gives root
        int current = preorder[index];
        index++;

        TreeNode node = new TreeNode(current);

        // Leaf node
        if (left == right) {
            return node;
        }

        // Find root position in inorder
        int IncurrentIndex = map.get(current);

        // Build left subtree
        node.left = helper(preorder, left, IncurrentIndex - 1, map);

        // Build right subtree
        node.right = helper(preorder, IncurrentIndex + 1, right, map);

        return node;
    }
}