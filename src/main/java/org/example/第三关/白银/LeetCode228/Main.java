package org.example.第三关.白银.LeetCode228;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 汇总区间
 *
 * @author: xlf
 * @date: 2023/11/15
 */
public class Main {

//    输入：nums = [0,1,2,4,5,7]
//    输出：["0->2","4->5","7"]
//    解释：区间范围是：
//            [0,2] --> "0->2"
//            [4,5] --> "4->5"
//            [7,7] --> "7"

    public List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();
        // slow 初始指向第 1 个区间的起始位置
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            // fast 向后遍历，直到不满足连续递增（即 nums[fast] + 1 != nums[fast + 1] )
            // 或者fast达到数组边界，则当前连续递增区间[slow,fast]遍历完毕，将其写入结果列表
            if (fast + 1 == nums.length || nums[fast] + 1 != nums[fast + 1]) {
                // 将当前区间[slow,fast] 写入结果列表
                StringBuilder sb = new StringBuilder();
                sb.append(nums[slow]);
                if (slow != fast) {
                    sb.append("->").append(nums[fast]);
                }
                res.add(sb.toString());
                // 将slow 指向更新为 fast+ 1，作为下一个区间的起始位置
                slow = fast + 1;
            }
        }
        return res;
    }
}
