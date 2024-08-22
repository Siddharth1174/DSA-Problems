//Problem Link:
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
//Solution:
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // Queue to perform level order traversal
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);

        boolean leftToRight = true;

        while (!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();
            List<Integer> row = new ArrayList<>();

            // Traverse nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode node = nodesQueue.poll();
                
                // Insert node's value according to the current direction
                if (leftToRight) {
                    row.add(node.val); // Add at the end for left-to-right
                } else {
                    row.add(0, node.val); // Add at the start for right-to-left
                }

                if (node.left != null) nodesQueue.add(node.left);
                if (node.right != null) nodesQueue.add(node.right);
            }

            // Switch the direction
            leftToRight = !leftToRight;
            
            // Add current level to result list
            result.add(row);
        }

        return result;
    }
}
