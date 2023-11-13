package org.example.第三关.青铜.LeetCode896;

/**
 * Description 单调数列
 *
 * @author: xlf
 * @date: 2023/11/13
 */
public class Main {

    public boolean isMonotonic(int[] nums) {
        return isSorted(nums, true) || isSorted(nums, false);
    }

    /**
     * @param nums       原数组
     * @param increasing 递增或递减
     * @return boolean
     */
    public boolean isSorted(int[] nums, boolean increasing) {
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


}
