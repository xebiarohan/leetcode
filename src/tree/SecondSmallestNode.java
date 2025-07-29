package tree;

public class SecondSmallestNode {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(2, new TreeNode(2, null, null), new TreeNode(5, new TreeNode(5, null, null), new TreeNode(7, null, null)));
        //  TreeNode node = new TreeNode(2, new TreeNode(2, null, null), new TreeNode(2, null, null));

        System.out.println(findSecondMinimumValue(node));
    }

    static int secondMinValue = Integer.MAX_VALUE;
    static int minValue = Integer.MAX_VALUE;

    public static int findSecondMinimumValue(TreeNode root) {
        minValue = root.val;
        getSecondMinNode(root);
        return secondMinValue == Integer.MAX_VALUE ? -1 : secondMinValue;
    }

    public static void getSecondMinNode(TreeNode root) {
        if (root.left != null && root.right != null && root.left.val != root.right.val) {

            int currentMinValue = Math.min(root.left.val, root.right.val);
            if (currentMinValue == minValue) {
                secondMinValue = Math.min(secondMinValue, Math.max(root.left.val, root.right.val));
            } else {
                secondMinValue = Math.min(secondMinValue, currentMinValue);
            }
            getSecondMinNode(root.left);
            getSecondMinNode(root.right);
        }
    }


}
