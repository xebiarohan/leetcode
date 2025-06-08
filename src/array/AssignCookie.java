package array;

import java.util.Arrays;

public class AssignCookie {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1,2,3}));;
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int greedIndex = 1;
        int cookieIndex  =1;

        while (greedIndex <=g.length && cookieIndex <= s.length) {
            if(g[greedIndex-1] <= s[cookieIndex-1]) {
                greedIndex++;
                cookieIndex++;
            } else {
                cookieIndex++;
            }
        }

        return greedIndex-1;

    }
}
