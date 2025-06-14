package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutiveSequence(new int[]{-2,-1,0,1, 2, 3, 4, 5}));
    }

    public static int longestConsecutiveSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i: arr) {
            set.add(i);
        }
        int maxStreax = 0;
        for(int i: set) {
            if(!set.contains(i-1)) {
                int currentNumber = i;
                int temp =1;
                while (set.contains(currentNumber+1)) {
                    currentNumber = currentNumber+1;
                    temp++;
                }

                maxStreax = Math.max(maxStreax,temp);
            }
        }

        return maxStreax;
    }
}
