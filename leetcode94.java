import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // 1. Travel to the leftmost node, pushing all nodes along the way onto the stack.
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // 2. Pop the top node (which is the next leftmost and should be visited).
            current = stack.pop();
            result.add(current.val);

            // 3. Move to the right child to start the process for the right subtree.
            current = current.right;
        }

        return result;
    }
}