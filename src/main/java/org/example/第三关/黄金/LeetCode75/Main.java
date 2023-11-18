package org.example.第三关.黄金.LeetCode75;

/**
 * Description 颜色分类
 *
 * @author: xlf
 * @date: 2023/11/18
 */
public class Main {


//    输入：nums = [2,0,2,1,1,0]
//    输出：[0,0,1,1,2,2]


    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        // 将所有0的数字移到前面
        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

        // 将所有1的数字移到前面
        for (int right = left; right < n; right++) {
            if (nums[right] == 1) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }


    public void sortColors1(int[] nums) {
        int right = nums.length - 1;
        int left = 0, index = 0;

        while (index <= right) {
            if (nums[index] < 1) {
                swap(nums, index++, left++);
            } else if (nums[index] > 1) {
                swap(nums, index, right--);
            } else {
                index++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
