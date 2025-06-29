package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            depth++;
            int currentQueueSize = nodes.size();
            for(int i=0;i<currentQueueSize;i++) {
                TreeNode node = nodes.remove();
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
        }
        return depth;
    }

    public int maxDepthUsingDFS(TreeNode root) {
       if(root == null) {
           return 0;
       }

       return  1 + Math.max(maxDepthUsingDFS(root.left), maxDepthUsingDFS(root.right));
    }
}
