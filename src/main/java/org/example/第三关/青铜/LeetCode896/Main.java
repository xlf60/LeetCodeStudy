package org.example.第三关.青铜.LeetCode896;

/**
 * Description 单调数列
 *
 * @author: xlf
 * @date: 2023/11/13
 */
public class Main {

    public boolean isMonotonic(int[] nums) {
//        return isSortedDouble(nums, true) || isSortedDouble(nums, false);
        return isSortedSinger(nums);
    }

    /**
     * 方法一 两次循环
     *
     * @param nums       原数组
     * @param increasing 递增或递减
     * @return boolean
     */
    public boolean isSortedDouble(int[] nums, boolean increasing) {
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            if (increasing) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 方法一
     *
     * @param nums 原数组
     * @return boolean
     */
    public boolean isSortedSinger(int[] nums) {

        boolean inc = true, dec = true;
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }

        }
        return inc || dec;
    }

}
