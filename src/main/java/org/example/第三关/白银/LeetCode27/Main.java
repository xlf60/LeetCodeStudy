package org.example.第三关.白银.LeetCode27;

/**
 * Description 移除元素
 *
 * @author: xlf
 * @date: 2023/11/14
 */
public class Main {

//    输入：nums = [3,2,2,3], val = 3
//    输出：2, nums = [2,2]

    /**
     * 快慢双指针
     */
    public int removeElement1(int[] nums, int val) {
        int slow = 0;
        // fast充当了快指针的角色
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        // 最后剩余元素的数量
        return slow;
    }


    /**
     * 对撞双指针
     */
    public int removeElement2(int[] nums, int val) {
        int right = nums.length - 1;
        int left = 0;

        while (left <= right) {
            if ((nums[left] == val) && (nums[right] != val)) {
                nums[left] = nums[right];
                nums[right] = val;
            }
            if (nums[left] != val) {
                left++;
            }
            if (nums[right] == val) {
                right--;
            }
        }
        return left;
    }

    /**
     * 对撞双指针 + 覆盖
     */
    public int removeElement3(int[] nums, int val) {
        int right = nums.length - 1;
        int left = 0;

        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }
}
