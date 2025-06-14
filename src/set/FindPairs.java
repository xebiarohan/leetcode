package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairs {
    public static void main(String[] args) {

    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> set1 = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for (int i : arr1) {
            set1.add(i);
        }

        for(Integer a: arr2) {
            if(set1.contains(target - a)) {
                result.add(new int[]{a, target-a});
            }
        }

        return result;

    }
}
