package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
    }

    public static int[] twoSum(int[] nums, int value){
        List<Integer> numbers = new ArrayList<>();

        for(Integer num:nums) {
            numbers.add(num);
        }

        for(int i=0;i<nums.length;i++) {
            int temp = value - nums[i];
            if(numbers.contains(temp) && i != numbers.indexOf(temp)) {
                return new int[]{i,numbers.indexOf(temp)};
            }
        }
        return new int[]{};
    }
}
