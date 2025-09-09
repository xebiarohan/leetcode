package tree;

public class RangeSum {
    int result = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        add(root, low, high);
        return result;
    }

    public void add(TreeNode node, int low, int high) {
        if (node == null) {
            return;
        }

        int val = node.val;
        if(val >= low && val <= high) {
            result+=val;
        }

        if (val >= low && node.left != null) {
            add(node.left, low, high);
        }

        if (val <= high && node.right != null) {
            add(node.right, low, high);
        }
    }
}
