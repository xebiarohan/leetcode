package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PathCrossing {
    public static void main(String[] args) {
        System.out.println(isPathCrossingNg("NESWW"));
    }
    public boolean isPathCrossing(String path) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> currentPoint = new ArrayList<>();
        currentPoint.add(0);
        currentPoint.add(0);

        set.add(currentPoint);

        for(char c: path.toCharArray()) {
            List<Integer> list = getIntegers(c, currentPoint);

            if(set.contains(list)) {
                return true;
            }

            set.add(list);
            currentPoint = list;
        }

        return false;
    }

    public static boolean isPathCrossingNg(String path) {
        Set<int[]> set = new HashSet<>();
        int[] currentPoint = new int[2];

        set.add(currentPoint);

        for(char c: path.toCharArray()) {
            int[] list = getIntegersNg(c, currentPoint);

            if(set.contains(list)) {
                return true;
            }

            set.add(list);
            currentPoint = list;
        }

        return false;
    }

    private static int[] getIntegersNg(char c, int[] currentPoint) {
        int[] list = new int[2];
        if(c == 'N') {
            list[0] = currentPoint[0] + 1;
            list[1] = currentPoint[1];
        } else if(c == 'S') {
            list[0] = currentPoint[0] - 1;
            list[1] = currentPoint[1];
        } else if(c == 'E') {
            list[0] = currentPoint[0];
            list[1] = currentPoint[1] + 1;
        } else {
            list[0] = currentPoint[0];
            list[1] = currentPoint[1] - 1;
        }
        return list;
    }

    private static List<Integer> getIntegers(char c, List<Integer> currentPoint) {
        List<Integer> list = new ArrayList<>();
        if(c == 'N') {
            list.add(currentPoint.get(0) + 1);
            list.add(currentPoint.get(1));
        } else if(c == 'S') {
            list.add(currentPoint.get(0) - 1);
            list.add(currentPoint.get(1));
        } else if(c == 'E') {
            list.add(currentPoint.get(0));
            list.add(currentPoint.get(1) +1);
        } else {
            list.add(currentPoint.get(0));
            list.add(currentPoint.get(1)  - 1);
        }
        return list;
    }
}
