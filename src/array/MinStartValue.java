package array;

public class MinStartValue {
    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{-3,2,-3,4,2}));
    }
    public static int minStartValue(int[] nums) {
        int startValue = 1;
        int currentTotal = 1;
        for(int i=0;i<nums.length;i++) {
            if(currentTotal + nums[i] < 1) {
                 int x = 1 - (currentTotal + nums[i]);
                 startValue = startValue + x;
                 currentTotal = 1;
            } else {
              currentTotal = currentTotal + nums[i];
            }
        }

        return startValue;
    }
}
