package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII {
    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1,2,3}));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        getResult(nums, result);
        return result;
    }

    public static void getResult(int[] nums, List<List<Integer>> result) {
        if (nums.length == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            result.add(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int[] temp = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    temp[index++] = nums[j];
                }
            }

            List<List<Integer>> tempList = permuteUnique(temp);
            for (int k = 0; k < tempList.size(); k++) {
                tempList.get(k).add(n);
            }
            result.addAll(tempList);
        }
    }
}
