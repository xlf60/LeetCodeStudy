package org.example.第三关.白银.LeetCode189;

/**
 * Description 轮转数组
 *
 * @author: xlf
 * @date: 2023/11/15
 */
public class Main {

//    输入: nums = [1,2,3,4,5,6,7], k = 3
//    输出: [5,6,7,1,2,3,4]
//    解释:
//    向右轮转 1 步: [7,1,2,3,4,5,6]
//    向右轮转 2 步: [6,7,1,2,3,4,5]
//    向右轮转 3 步: [5,6,7,1,2,3,4]


    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    /**
     * 反转数组
     */
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
