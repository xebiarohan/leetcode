package array;

public class RunningSum {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        int total = 0;

        for(int i=0;i<nums.length;i++) {
            nums[i] = nums[i] + total;
            total = nums[i];
        }

        return nums;
    }
}
