package org.example.第三关.青铜.LeetCode35;

/**
 * Description 搜索插入位置
 *
 * @author: xlf
 * @date: 2023/11/13
 */
public class Main {

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int right = length - 1, left = 0, ans = length;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
