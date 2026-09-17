// Last updated: 9/17/2026, 12:46:24 PM
1import java.util.*;
2class Solution {
3    public int longestValidParentheses(String s) {
4        Stack<Integer> stack = new Stack<>();
5        stack.push(-1);
6        int maxLength = 0;
7        for (int i = 0; i < s.length(); i++) {
8            if (s.charAt(i) == '(') {
9                stack.push(i);
10            } 
11            else {
12                stack.pop();
13                if (stack.isEmpty()) {
14                    stack.push(i);
15                } 
16                else {
17                    int length = i - stack.peek();
18                    maxLength = Math.max(maxLength, length);
19                }
20            }
21        }
22
23        return maxLength;
24    }
25}