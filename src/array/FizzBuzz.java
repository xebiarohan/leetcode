package array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(10));
    }

    public static  List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        while (list.size() +1 <=n) {
            if((list.size() +1)%3 == 0) {
                if((list.size() +1)%5 ==0) {
                    list.add("FizzBuzz");
                } else {
                    list.add("Fizz");
                }
            } else if((list.size() +1)%5  == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf((list.size() +1)));
            }
        }

        return list;
    }
}
