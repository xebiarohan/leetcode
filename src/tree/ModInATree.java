package tree;

import java.util.*;

public class ModInATree {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        updateData(root);
        if(!map.isEmpty()) {

            int maxOccurance = 0;
            for(Integer value: map.values()) {
                if(value > maxOccurance) {
                    maxOccurance = value;
                }
            }

            List<Integer> resultList = new ArrayList<>();

            for(Map.Entry entry: map.entrySet()) {
                if(entry.getValue().equals(maxOccurance)) {
                    resultList.add((Integer) entry.getKey());
                }
            }
            return resultList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

        }
        return new int[0];
    }

    public void updateData(TreeNode node) {
        if(node != null) {
            map.put(node.val, map.getOrDefault(node.val,0) +1);
            updateData(node.left);
            updateData(node.right);
        }
    }
}
