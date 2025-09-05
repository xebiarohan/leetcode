package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> permute = permute(new int[]{1, 2, 3});
        System.out.println(permute);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            result.add(list);
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int[] otherElements = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    otherElements[index++] = nums[j];
                }
            }

            List<List<Integer>> tempLists = permute(otherElements);

            for (int k = 0; k < tempLists.size(); k++) {
                tempLists.get(k).add(n);
            }
            result.addAll(tempLists);
        }
        return result;
    }


}
