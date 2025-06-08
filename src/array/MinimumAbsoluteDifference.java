package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{1,3,6,10,15}));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int minDifference = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i=0; i <arr.length-1;i++) {
            if(arr[i+1] - arr[i] <= minDifference) {
                if(arr[i+1] - arr[i] < minDifference) {
                    result.clear();
                }
                result.add(List.of(arr[i],arr[i+1]));
                minDifference = arr[i+1]-arr[i];
            }
        }
        return result;
    }
}
