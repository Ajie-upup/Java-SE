package class02_数组;

import java.util.Arrays;

/**
 * @Author: ajie
 * @Date: 2022/11/15
 */
public class code02_冒泡排序 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 7, 9, 4, 6, 5};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
