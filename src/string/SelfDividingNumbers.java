package string;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for(int i = left;i<=right;i++) {
            boolean notValid = false;
            int value = i;
            while (value > 0) {
                int rem = value%10;
                if (rem == 0 || i % rem != 0) {
                    notValid = true;
                    break;
                }
                value = value/10;
            }
            if(!notValid) {
                result.add(i);
            }

        }
        return result;
    }
}
