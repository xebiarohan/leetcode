package tree;

public class BinaryTreeTilt {
    public static void main(String[] args) {

    }

    int finalResult = 0;
    public int findTilt(TreeNode root) {
        tilt(root);
        return finalResult;
    }

    public int sum(TreeNode node) {
        if(node != null) {
            return node.val + sum(node.left) + sum(node.right);
        }
        return 0;
    }

    public int tilt(TreeNode node) {
        if(node != null) {
            int tilt = Math.abs(tilt(node.left) - tilt(node.right));
            finalResult = finalResult + tilt;
            if(node.left != null && node.right != null) {
                return node.val + node.left.val + node.right.val;
            } else if(node.left == null && node.right == null) {
                return node.val;
            } else if(node.left == null) {
                return node.val + node.right.val;
            } else {
                return node.val + node.left.val;
            }
        }
        return 0;
    }
}
