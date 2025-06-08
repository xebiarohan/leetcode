package string;

import java.util.ArrayList;
import java.util.Arrays;

public class OccurancesAfterBigram {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student" ,"a","good")));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> result = new ArrayList<>();
        String[] words = text.split(" ");

        for(int i=1;i<words.length-1;i++) {
            if(words[i].equals(second) && words[i-1].equals(first)) {
                result.add(words[i+1]);
            }
        }

        return result.toArray(new String[0]);
    }
}
