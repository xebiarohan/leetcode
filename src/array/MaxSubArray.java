package array;

public class MaxSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubarray(new int[]{1, 2, 3, -4, 5, 6}));
    }
    public static int maxSubarray(int[] nums) {
        int maxTotal = nums[0];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 0) {
                int internalTotal = nums[i];
                if(internalTotal > maxTotal) {
                    maxTotal = internalTotal;
                }
                for(int j= i+1;j<nums.length;j++) {
                    internalTotal = internalTotal+ nums[j];
                    if(internalTotal < 0) {
                        break;
                    }
                    if(internalTotal > maxTotal) {
                        maxTotal = internalTotal;
                    }
                }
            }
        }
        return maxTotal;
    }
}
