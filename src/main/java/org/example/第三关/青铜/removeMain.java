package org.example.第三关.青铜;

/**
 * Description 删除一个元素
 *
 * @author: xlf
 * @date: 2023/11/13
 */
public class removeMain {

    /**
     * @param arr  原始数组
     * @param size 数组已经存储的元素熟练，从1开始编号
     * @param key  要删除的元素
     * @return int
     */
    public static int removeByElementSequence(int[] arr, int size, int key) {
        if (size > arr.length) {
            return -1;
        }

        int index = -1;
        // 查找到要删除的元素并记录其下标
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
                size--;
            }
        }
        return size;
    }
}
