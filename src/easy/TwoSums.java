package easy;

import java.util.HashMap;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }

        for(int j=0;j<nums.length-1;j++) {
           int otherValue = target - nums[j];
           if(map.containsKey(otherValue) && map.get(otherValue) != j) {
               return new int[]{j,map.get(otherValue)};
           }
        }


        return new int[]{};
    }
}
