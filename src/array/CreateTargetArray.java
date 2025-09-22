package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {


    public static void main(String[] args) {
        int[] targetArray = createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});
        System.out.println(Arrays.toString(targetArray));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[index.length];

        for(int i=0;i<index.length;i++) {
            list.add(index[i], nums[i]);
            result[index[i]] = nums[i];
        }


        for(int i=0;i<list.size();i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
