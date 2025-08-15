package TwoDArray;

import java.util.TreeMap;

public class MaxUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i =0;i< boxTypes.length;i++) {
            map.put(boxTypes[i][1],boxTypes[i][0]);
        }

        map.entrySet().forEach(entry -> {

        });

        // https://leetcode.com/problems/maximum-units-on-a-truck/description/?envType=problem-list-v2&envId=2sehjcdj
        return 0;
    }
}
