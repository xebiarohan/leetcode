package tree;

public class SumRootToLeaf {
    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        traverseNodes(root,"");
        return sum;
    }

    public void traverseNodes(TreeNode node, String currentValue) {
        if(node != null) {
            currentValue += node.val;
            if(node.left == null && node.right == null) {
                sum +=Integer.parseInt(currentValue,2);
            } else {
                traverseNodes(node.left, currentValue);
                traverseNodes(node.right, currentValue);
            }
        }
    }
}
