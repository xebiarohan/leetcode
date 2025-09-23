package string;

import java.util.ArrayList;
import java.util.List;

public class ReformatTheString {
    public static void main(String[] args) {
        System.out.println(reformatOld("a0b1c2"));
    }


    public static String reformatOld(String s) {
        List<Character> numberCharacters = new ArrayList<>();
        List<Character> stringCharacters = new ArrayList<>();

        for(int i=0;i< s.length();i++) {
            if(Character.isDigit(s.charAt(i))) {
                numberCharacters.add(s.charAt(i));
            } else {
                stringCharacters.add(s.charAt(i));
            }
        }

        int count = numberCharacters.size() - stringCharacters.size();
        if(count < -1 || count > 1) {
            return "";
        } else if(count < 0) {
            int counter = 0;
            StringBuilder builder = new StringBuilder();
            while (counter < stringCharacters.size() || counter < numberCharacters.size()) {

                if(counter < stringCharacters.size()) {
                    builder.append(stringCharacters.get(counter));
                }

                if(counter < numberCharacters.size()) {
                    builder.append(numberCharacters.get(counter));
                }
                counter++;
            }

            return builder.toString();
        } else {
            int counter = 0;
            StringBuilder builder = new StringBuilder();
            while (counter < stringCharacters.size() || counter < numberCharacters.size()) {
                if(counter < numberCharacters.size()) {
                    builder.append(numberCharacters.get(counter));
                }

                if(counter < stringCharacters.size()) {
                    builder.append(stringCharacters.get(counter));
                }
                counter++;
            }

            return builder.toString();
        }
    }
}
