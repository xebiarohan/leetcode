package TwoDArray;

import java.util.*;
import java.util.stream.Collectors;

public class KWeekestRows {

    public static void main(String[] args) {
        kWeakestRows(new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}},3);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    soldiers++;
                } else {
                    break;
                }
            }
            map.put(i, (soldiers + 0.1 * (mat[i].length - soldiers)));
        }

        int temp = 0;
        List<Integer> list = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).toList();
        while (temp != k) {
            result[temp] = list.get(temp);
            temp++;
        }

        return result;

    }
}
