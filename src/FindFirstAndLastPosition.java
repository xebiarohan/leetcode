import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        FindFirstAndLastPosition findFirstAndLastPosition = new FindFirstAndLastPosition();
        int[] ints = findFirstAndLastPosition.searchRange(new int[]{1}, 1);
        System.out.println(Arrays.toString(ints));
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1,-1};

        int front = 0;
        int last = nums.length-1;

        while (front <= last) {
            int mid = front + (last-front)/2;

            if(target == nums[mid]) {
                result[0] = getFirstValue(nums,mid, target);
                result[1] = getLastValue(nums,mid,target);
                break;
            } else if(target < nums[mid]) {
                last = mid-1;
            } else {
                front = mid+1;
            }
        }

        return result;
    }

    public int getFirstValue(int[] nums, int maxPossibleSolution, int target) {
        while (maxPossibleSolution >= 0 && nums[maxPossibleSolution] == target) {
            maxPossibleSolution--;
        }
        return ++maxPossibleSolution;
    }

    public int getLastValue(int[] nums, int maxPossibleSolution, int target) {
        while (maxPossibleSolution < nums.length && nums[maxPossibleSolution] == target) {
            maxPossibleSolution++;
        }
        return --maxPossibleSolution;
    }
}
