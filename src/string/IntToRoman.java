package string;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }

    public static String intToRoman(int num) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        String romanLetters = "MDCLXVI";
        int index = 0;
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V', 5);
        map.put('I', 1);

        while (num > 0) {
            char character = romanLetters.charAt(index);
            Integer characterValue = map.get(character);
            while (num < characterValue) {
                index++;
                character = romanLetters.charAt(index);
                characterValue = map.get(character);
            }

            if(num/characterValue > 0) {
                builder.append(String.valueOf(character).repeat(num/characterValue));
                index++;
                num = num%characterValue;
            } else {
                int nextIndex = index+1;
                while ((nextIndex < romanLetters.length())) {
                    if((characterValue - map.getOrDefault(nextIndex,0)) == num) {
                        builder.append(romanLetters.charAt(nextIndex)).append(characterValue);
                        return builder.toString();
                    } else {
                        nextIndex++;
                    }
                }
                index++;
            }

        }

        return builder.toString();
    }
}
