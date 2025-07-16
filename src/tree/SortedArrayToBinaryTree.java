package tree;

import java.util.Arrays;

public class SortedArrayToBinaryTree {
    public static void main(String[] args) {
        sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        int minIndex = (nums.length - 1) / 2;
        TreeNode root = new TreeNode(nums[minIndex]);
        if(minIndex > 0){
            root.left = sortedArrayToBST(Arrays.copyOf(nums, minIndex));
        }
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, minIndex + 1, nums.length));
        return root;
    }
}
