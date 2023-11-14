package org.example.第三关.青铜;

/**
 * Description 增加一个元素
 *
 * @author: xlf
 * @date: 2023/11/13
 */
public class addMain {


        /**
         * @param arr     原始数组
         * @param size    数组已经存储的元素熟练，从1开始编号
         * @param element 待插入的元素
         * @return int
         */
        public static int addByElementSequence(int[] arr, int size, int element) {
            if (size > arr.length) {
                return -1;
            }
            int index = size;

            // 找到要插入位置的下标
            for (int i = 0; i < size; i++) {
                if (element < arr[i]) {
                    index = i;
                    break;
                }
            }
            // 将数组向后移一位
            for (int j = size; j > index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = element;
            return index;
        }
}
