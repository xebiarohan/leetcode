package map;

import java.util.HashMap;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
    }

    private static Character firstNonRepeatingChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(Character c: str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Character c: str.toCharArray()) {
            if(map.getOrDefault(c,0) == 1) {
                return c;
            }
        }

        return null;
    }
}
