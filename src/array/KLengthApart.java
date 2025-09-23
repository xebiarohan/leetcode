package array;

public class KLengthApart {
    public boolean kLengthApart(int[] nums, int k) {
        int currentGap = k+1;
        boolean start = false;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {

                if(start && currentGap < k) {
                    return false;
                }
                start = true;
                currentGap = 0;
            } else {
                if(start) {
                    currentGap++;
                }
            }
        }

        return true;
    }
}
