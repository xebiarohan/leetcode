package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {
    public static void main(String[] args) {
        System.out.println(findLucky2(new int[]{1,2,2,3,3,3}));
    }

    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = -1;

        for(int a: arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(Integer key: map.keySet()) {
            if(map.get(key).equals(key)) {
               result = Math.max(result, key);
            }
        }


        return result;
    }


    public static int findLucky2(int[] arr) {
        Arrays.sort(arr);

        int result = -1;

        int currentValue = -1;
        int currentValueOccurrence = 0;

        for (int j : arr) {
            if (j != currentValue) {
                if (currentValue == currentValueOccurrence) {
                    result = Math.max(currentValue, result);
                }
                currentValue = j;
                currentValueOccurrence = 1;
            } else {
                currentValueOccurrence++;
            }
        }

        return currentValueOccurrence == currentValue ? Math.max(currentValueOccurrence, result) : result;
    }
}
