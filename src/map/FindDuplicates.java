package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{1,2,3,4,2,3}));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        return map.entrySet().stream()
                .filter(entrySet -> entrySet.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
