package org.example.第三关.白银.LeetCode905;

/**
 * Description 按奇偶排序数组
 *
 * @author: xlf
 * @date: 2023/11/15
 */
public class Main {

//    输入：nums = [3,1,2,4]
//    输出：[2,4,3,1]
//    解释：[4,2,3,1]、[2,4,1,3] 和 [4,2,1,3] 也会被视作正确答案。

    /**
     * 对撞型双指针
     */
    public int[] sortArrayByParity(int[] nums) {

        int right = nums.length - 1, left = 0;
        while (left <= right) {
            if ((nums[left] % 2) != 0 && (nums[right] % 2) == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if (nums[left] % 2 == 0) {
                left++;
            }
            if (nums[right] % 2 != 0) {
                right--;
            }
        }
        return nums;
    }
}