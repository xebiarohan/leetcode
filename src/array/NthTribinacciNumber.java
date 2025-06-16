package array;

public class NthTribinacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {
        if(n==0) {
            return 0;
        } else if(n < 3) {
            return 1;
        }
        int[] arr = new int[38];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        for(int i=3;i<38;i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        return arr[n-1] + arr[n-2] + arr[n-3];
    }
}
