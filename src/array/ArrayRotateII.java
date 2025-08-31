package array;

import java.util.Arrays;

public class ArrayRotateII {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotateII(arr,3);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        while (k > 0) {
            int temp = nums[nums.length-1];

            for(int i=nums.length-1;i >0;i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }
    }

    public static void rotateII(int[] nums, int k) {
        int start = 0;
        int end = k-1;

        while (start < end) {
            int temp = nums[start];
            nums[start] =  nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        start = k;
        end = nums.length-1;

        while (start < end) {
            int temp = nums[start];
            nums[start] =  nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
