package org.example.第三关.青铜.LeetCode88;

/**
 * Description 合并两个有序数组
 *
 * @author: xlf
 * @date: 2023/11/13
 */
public class Main {




//    输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    输出：[1,2,2,3,5,6]
//    解释：需要合并 [1,2,3] 和 [2,5,6] 。
//    合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int len1 = m - 1, len2 = n - 1;
        while (len1 >= 0 && len2 >= 0) {
            if (nums1[len1] <= nums2[len2]) {
                nums1[i--] = nums2[len2--];
            } else {
                nums1[i--] = nums1[len1--];
            }
        }
        // 假如A或者B数组还有剩余的
        while (len1 != -1) {
            nums1[i--] = nums1[len1--];
        }
        while (len2 != -1) {
            nums1[i--] = nums2[len2--];
        }

    }
}
