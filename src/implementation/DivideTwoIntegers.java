package implementation;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,1));
    }

    public static int divide(int dividend, int divisor) {
        int result = 0;
        boolean isNegative = (divisor > 0 && dividend < 0) || (divisor < 0 && dividend > 0);

        divisor = Math.abs(divisor);
        dividend = Math.abs(dividend);

        if(dividend == divisor) {
            result = 1;
        } else {
            while (dividend > Math.abs(divisor)) {
                dividend = dividend - divisor;
                result++;
            }
        }


        return isNegative ? -1*result : result;
    }
}
