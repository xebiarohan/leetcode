package string;

import java.util.List;

public class StringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("MerryChristmas"));
    }

    public static boolean halvesAreAlike(String s) {
        int vowelsDifference = 0;
        String vowels = "aeiouAEIOU";

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (vowels.indexOf(s.charAt(i)) > -1) {
                vowelsDifference++;
            }
            if (vowels.indexOf(s.charAt(j)) > -1) {
                vowelsDifference--;
            }

            i++;
            j--;
        }

        return vowelsDifference == 0;
    }
}
