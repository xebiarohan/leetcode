package array;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        while (k > 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
    }
}
