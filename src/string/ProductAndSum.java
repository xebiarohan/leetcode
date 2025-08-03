package string;

public class ProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(705));
        ;
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int value = n % 10;
            n = n / 10;
            product = product * value;
            sum = value + sum;
        }

        return (product - sum);
    }
}
