package tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }

    public void traverse(TreeNode node, List<Integer> list) {
        if (node != null) {
            list.add(node.val);
            traverse(node.left, list);
            traverse(node.right, list);
        }
    }
}
