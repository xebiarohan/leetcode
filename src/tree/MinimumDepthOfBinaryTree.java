package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7,null, null)));
        System.out.println(minDepth(node));
    }


    public static int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;
            int queueSize = queue.size();
            for(int i=0;i<queueSize;i++) {
                TreeNode currentNode = queue.remove();

                if(currentNode.right == null && currentNode.left == null) {
                    return depth;
                } else {
                    if(currentNode.left != null) {
                        queue.add(currentNode.left);
                    }
                    if(currentNode.right != null) {
                        queue.add(currentNode.right);
                    }
                }
            }
        }
        return 0;
    }


}
