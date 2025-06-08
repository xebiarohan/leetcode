package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class SequencialDigits {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(10,300));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
//        List<Integer> a = new ArrayList<>();
//
//        for (int i = 1; i <= 9; ++i) {
//            int num = i;
//            int nextDigit = i + 1;
//
//            while (num <= high && nextDigit <= 9) {
//                num = num * 10 + nextDigit;
//                if (low <= num && num <= high) {
//                    a.add(num);
//                }
//                ++nextDigit;
//            }
//        }
//
//        a.sort(null);
//        return a;

        String c = "123456789";
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < c.length(); i++) {
            for (int j = i + 1; j <= c.length(); j++) {
                int curr = Integer.parseInt(c.substring(i, j));
                if (curr <= high && curr >= low) {
                    a.add(curr);
                }
            }
        }

        a.sort(null);
        return a;
    }
}
