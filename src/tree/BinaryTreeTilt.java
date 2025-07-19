package tree;

public class BinaryTreeTilt {
    public static void main(String[] args) {

    }

    int finalResult = 0;
    public int findTilt(TreeNode root) {
        if(root != null) {
            finalResult = finalResult + Math.abs(sum(root.right) - sum(root.left));;
            findTilt(root.left);
            findTilt(root.right);
        }
        return finalResult;
    }

    public int sum(TreeNode node) {
        if(node != null) {
            return node.val + sum(node.left) + sum(node.right);
        }
        return 0;
    }
}
