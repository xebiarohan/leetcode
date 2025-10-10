package array;

public class KthMissingNumber {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{5,6,7,8,9}, 9));
    }
    public static int findKthPositiveLinearWay(int[] arr, int k) {

        int i = 0;
        int value = 1;
        int currentArrayIndex = 0;

        while (i <k && currentArrayIndex < arr.length) {
            if(arr[currentArrayIndex] == value) {
                currentArrayIndex++;
            } else {
                i++;
            }
            value++;
        }

        if(i < k) {
            return value + k-i-1;
        }

        return value-1;
    }


    public static int findKthPositive(int[] arr, int k) {

        int missingNumberInternal =  arr[arr.length-1] - arr.length;

        if(missingNumberInternal >= k) {
            return findKthPositiveLinearWay(arr,k);
        } else {
            return arr[arr.length-1] + k - missingNumberInternal;
        }
    }
}
