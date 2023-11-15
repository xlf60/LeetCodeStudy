package org.example.第三关.白银.剑指offer05;

/**
 * Description 替换空格 请实现一个函数，把字符串s中的每个空格替换成"%20"。
 *
 * @author: xlf
 * @date: 2023/11/15
 */
public class Main {


//    输入：s = "We are happy."
//    输出："We%20are%20happy."

    public String replaceSpace(StringBuilder str) {
        if (str == null) {
            return null;
        }
        // 空格数量
        int numOfBlank = 0;
        int len = str.length();

        // 计算空格数量
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                numOfBlank++;
            }
        }
        // 设置新串的长度
        str.setLength(len + 2 * numOfBlank);
        int fast = len - 1;
        int slow = (len + 2 * numOfBlank) - 1;

        while (fast > 0 && slow > fast) {
            char c = str.charAt(fast);
            if (c == ' ') {
                fast--;
                str.setCharAt(slow--, '0');
                str.setCharAt(slow--, '2');
                str.setCharAt(slow--, '%');
            } else {
                str.setCharAt(slow, c);
                fast--;
                slow--;
            }
        }
        return str.toString();
    }
}
