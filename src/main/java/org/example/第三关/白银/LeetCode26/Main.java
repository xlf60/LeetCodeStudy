package org.example.第三关.白银.LeetCode26;

/**
 * Description 删除有序数组中的重复项
 *
 * @author: xlf
 * @date: 2023/11/14
 */
public class Main {

//    输入：nums = [0,0,1,1,1,2,2,3,3,4]
//    输出：5, nums = [0,1,2,3,4]

    public int removeDuplicates(int[] nums) {
        int slow = 1;
        // fast充当了快指针的角色
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        // 最后剩余元素的数量
        return slow;
    }
}
