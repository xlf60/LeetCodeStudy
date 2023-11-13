package org.example.第三关.青铜;

/**
 * Description 查找元素
 *
 * @author: xlf
 * @date: 2023/11/13
 */
public class findByElement {


    /**
     * @param arr  原始数组
     * @param size 数组已经存储的元素熟练，从1开始编号
     * @param key  待查找的元素
     * @return int
     */
    public static int findByElementSequence(int[] arr, int size, int key) {

        if (size > arr.length) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }
}
