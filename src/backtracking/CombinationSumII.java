package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        CombinationSumII sumII = new CombinationSumII();
        List<List<Integer>> lists = sumII.combinationSum2ng(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 5);
        System.out.println(lists);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combine(candidates, 0, new ArrayList<>(), result, 0, target);
        return result;
    }

    public void combine(int[] candidates, int index, List<Integer> currentList, List<List<Integer>> result, int currentSum, int target) {
        if(currentSum == target && !result.contains(currentList)) {
            result.add(new ArrayList<>(currentList));
        }

        if(currentSum > target) {
            return;
        }

        for(int i = index;i<candidates.length;i++) {
            if(i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            currentList.add(candidates[index]);
            currentSum = currentSum+candidates[index];
            combine(candidates, index+1, currentList, result, currentSum, target);

            currentSum = currentSum - currentList.remove(currentList.size()-1);

            combine(candidates, index+1, currentList, result, currentSum, target);
        }
    }


    public List<List<Integer>> combinationSum2ng(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();

        dfs(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private void dfs(int[] candidates, int target, int start, List<Integer> comb, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<Integer>(comb));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i-1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            comb.add(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, comb, res);
            comb.remove(comb.size() - 1);
        }
    }
}
