package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public static void main(String[] args) {

    }
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(null != root) {
            checkView(root);
        }
        return result;
    }

    public void checkView(TreeNode node) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int queueSize = queue.size()-1;
            for(int i=0;i<= queueSize;i++) {
                TreeNode currentNode = queue.poll();
                if(null != currentNode) {
                    if(currentNode.left != null) {
                        queue.add(currentNode.left);
                    }
                    if(currentNode.right != null) {
                        queue.add(currentNode.right);
                    }
                    if(i == queueSize) {
                        result.add(currentNode.val);
                    }
                }
            }
        }
    }
}
