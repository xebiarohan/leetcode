package array;

public class ShuffleArray {
    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        for(int i=0;i<nums.length/2;i++) {
            result[index++] = nums[i];
            result[index++] = nums[i+n];
        }

        return result;
    }
}
