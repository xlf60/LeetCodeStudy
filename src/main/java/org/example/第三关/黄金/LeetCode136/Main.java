package org.example.第三关.黄金.LeetCode136;

import java.util.HashSet;
import java.util.Set;

/**
 * Description 只出现一次的数字
 *
 * @author: xlf
 * @date: 2023/11/18
 */
public class Main {

//    输入：nums = [2,2,1]
//    输出：1


    public int singleNumber(int[] nums) {
        if (nums == null) {
            return -1;
        }
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) {
            if (!hashSet.add(num)) {
                hashSet.remove(num);
            }
        }
        if (hashSet.isEmpty()) {
            return -1;
        }
        return hashSet.toArray(new Integer[0])[0];
    }

    public int singleNumber1(int[] nums) {
        int flag = 0;
        for (int num : nums) {
            flag ^= num;
        }
        return flag;
    }


}
