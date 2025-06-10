package map;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> result = new ArrayList<>();

        for(String str: strings) {
            if(!result.isEmpty()) {
                boolean listFound = false;
                for(List<String> innerList: result) {
                    if(getHashMap(innerList.get(0)).equals(getHashMap(str))) {
                        innerList.add(str);
                        listFound = true;
                    }
                }
                if(!listFound) {
                    ArrayList<String> newList = new ArrayList<>();
                    newList.add(str);
                    result.add(newList);
                }
            } else{
                ArrayList<String> newList = new ArrayList<>();
                newList.add(str);
                result.add(newList);
            }
        }

        return result;
    }

    public static HashMap<Character, Integer> getHashMap(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c: str.toCharArray()) {
            map.put(c,map.getOrDefault(c,1)+1);
        }

        return map;
    }
}
