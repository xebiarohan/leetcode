package tree;

public class SumOfLeftLeaves {
    public static void main(String[] args) {

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root.left == null && root.right == null) {
            return 0;
        }

        int result = 0;
        if(root.left != null) {
            result += getLeftLeafValue(root.left);
        }

        if(root.right != null) {
            return  result += sumOfLeftLeaves(root.right);
        }

        return result;
    }

    public static int getLeftLeafValue(TreeNode node) {
        int value = 0;
        if(node.left == null && node.right == null) {
            return node.val;
        }
        if(node.left != null) {
            value += getLeftLeafValue(node.left);
        }
        if(node.right != null) {
            value+= sumOfLeftLeaves(node.right);
        }

        return value;
    }
}
