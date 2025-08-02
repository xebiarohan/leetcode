package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NUniqueIntegers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        for(int i=1;i<n;i++) {
            arr[i-1] = i;
            sum+=i;
        }
        arr[n-1] = -sum;
        return arr;
    }
}
