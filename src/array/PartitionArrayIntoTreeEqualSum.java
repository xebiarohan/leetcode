package array;

import java.util.Arrays;

public class PartitionArrayIntoTreeEqualSum {
    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{3,3,6,5,-2,2,5,1,-9,4}));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int n: arr) {
            sum += n;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int target = sum / 3;
        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            currentSum += arr[i];
            if (currentSum == target) {
                currentSum = 0;
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }

        return false;
    }
}
