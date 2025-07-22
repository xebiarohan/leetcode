package tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifference {
    int minDifference = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        updateMinDifference(root);

        for(int i=0;i<list.size()-1;i++) {
            minDifference = Math.min(minDifference, list.get(i+1) - list.get(i));
        }
        return minDifference;
    }

    public void updateMinDifference(TreeNode node) {
        if(node.left != null) {
            updateMinDifference(node.left);
        }

        list.add(node.val);

        if(node.right != null) {
            updateMinDifference(node.right);
        }
    }


}
