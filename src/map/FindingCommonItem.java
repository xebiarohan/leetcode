package map;

import java.util.HashMap;

public class FindingCommonItem {
    public static void main(String[] args) {

    }

    public boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int i: array1) {
            map.put(i, true);
        }

        for(int j: array2) {
            if(map.getOrDefault(j,false).equals(true)) {
                return true;
            }
        }

        return false;
    }
}
