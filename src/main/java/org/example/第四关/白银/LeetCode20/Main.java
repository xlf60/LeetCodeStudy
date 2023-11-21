package org.example.第四关.白银.LeetCode20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Description 有效的括号
 *
 * @author: xlf
 * @date: 2023/11/21
 */
public class Main {

//    示例 1：
//    输入：s = '()'
//    输出：true
//
//    示例 2：
//    输入：s = '()[]{}'
//    输出：true
//
//    示例 3：
//    输入：s = '(]'
//    输出：false

    public boolean isValid(String s) {
        Map<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('[', ']');
        hashMap.put('{', '}');
        if (s.length() <= 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (hashMap.containsKey(item)) {
                stack.push(item);
            } else {
                if (!stack.isEmpty()) {
                    Character left = stack.pop();
                    Character right = hashMap.get(left);
                    if (right != item){
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
