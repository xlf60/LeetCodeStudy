package org.example.第三关.黄金.剑指Offer39;

import java.util.HashMap;
import java.util.Map;

/**
 * Description 数组中出现次数超过一半的数字
 *
 * @author: xlf
 * @date: 2023/11/18
 */
public class Main {
//    题目
//    数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
//    你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//    示例 1:
//    输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
//    输出: 2


    /**
     * 第一种：hash表
     */
    public int moreThanHalfNum1(int[] array) {
        if (array == null) {
            return 0;
        }
        Map<Integer, Integer> res = new HashMap<>();
        int len = array.length;
        for (int j : array) {
            res.put(j, res.getOrDefault(j, 0) + 1);
            if (res.get(j) > len / 2){
                return j;
            }
        }
        return 0;
    }


    /**
     * 第二种：摩尔投票
     */
    public int moreThanHalfNum2(int[] array) {
        int count = 0;
        int candidate = -1;
        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

}
