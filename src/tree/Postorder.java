package tree;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }

    public void traverse(TreeNode node, List<Integer> list) {
        if (node != null) {
            traverse(node.left, list);
            traverse(node.right, list);
            list.add(node.val);
        }
    }
}
