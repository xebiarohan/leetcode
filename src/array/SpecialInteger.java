package array;

public class SpecialInteger {
    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
    }
    public static int findSpecialInteger(int[] arr) {
        int currentValue = arr[0];
        int currentCount = 1;
        int maxTimes = arr.length/4;

        for(int i = 1; i<arr.length;i++) {
            if(currentCount > maxTimes) {
                return currentValue;
            }
            if(arr[i] == currentValue) {
                currentCount++;
            } else {
                currentValue = arr[i];
                currentCount = 1;
            }
        }
        return currentValue;
    }
}
