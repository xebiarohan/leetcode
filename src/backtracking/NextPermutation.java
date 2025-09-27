package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        List<List<Integer>> lists = getPermutations(nums);
        lists.sort(
                Comparator
                        .comparing((List<Integer> x) -> x.get(0))
                        .thenComparing((List<Integer> x) -> x.get(1))
        );

        System.out.println(lists);
    }

    public static List<List<Integer>> getPermutations(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 1) {
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
                if(i != j) {
                    otherElements[index++] = nums[j];
                }
            }

            List<List<Integer>> lists = getPermutations(otherElements);

            for(int k=0;k< lists.size();k++) {
                lists.get(k).add(n);
            }
            result.addAll(lists);
        }
        return result;

    }


}
