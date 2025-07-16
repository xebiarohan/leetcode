package tree;

public class PathSum {
    static boolean isPresent = false;

    public static void main(String[] args) {
        // 5,4,8,11,null,13,4,7,2,null,null,null,1],
        TreeNode treeNode = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7, null, null), new TreeNode(2, null, null)), null),
                new TreeNode(8, null, null));
        hasPathSum(treeNode,22);
        System.out.println(isPresent);
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }

        checkSum(root, targetSum, 0);
        return isPresent;
    }

    public static void checkSum(TreeNode node, int targetSum, int currentSum) {
        if(node == null) {
            return;
        } else if(node.left == null && node.right == null) {
            currentSum = currentSum + node.val;
            if(targetSum == currentSum) {
                isPresent = true;
            }
        } else {
            checkSum(node.left, targetSum, currentSum + node.val);
            checkSum(node.right, targetSum, currentSum + node.val);
        }
    }
}
