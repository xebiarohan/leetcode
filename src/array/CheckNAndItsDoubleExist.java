package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckNAndItsDoubleExist {
   List<Integer> list = new ArrayList<>();

    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(list.contains(arr[i]*2) || (list.contains(arr[i]/2) && arr[i]%2 == 0)) {
                return true;
            }
            list.add(arr[i]);
        }
        return false;
    }
}
