package tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafsOfTree1 = new ArrayList<>();
        List<Integer> leafsOfTree2 = new ArrayList<>();

        addLeafInList(root1, leafsOfTree1);
        addLeafInList(root2, leafsOfTree2);

       return leafsOfTree2.equals(leafsOfTree1);
    }

    public void addLeafInList(TreeNode node, List<Integer> list) {
        if(node != null) {
            if(node.left == null && node.right == null) {
                list.add(node.val);
            } else {
                addLeafInList(node.left, list);
                addLeafInList(node.right, list);
            }
        }
    }

}
