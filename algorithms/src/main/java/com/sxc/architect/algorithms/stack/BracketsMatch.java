package com.sxc.architect.algorithms.stack;

import java.util.Stack;

/**
 * 括号合法性验证
 * @Date 20201108
 */
public class BracketsMatch {

    static char[] b1 = new char[]{'[',']'};
    static char[] b2 = new char[]{'(',')'};

    public static void main(String[] args) {
        String str = "[[()()[]]]";
        char[] chars = str.toCharArray();
        System.out.println(isMatch(chars));
    }

    static boolean isMatch(char[] chars) {
        Stack<Character> stack = new Stack();
        for (int i = chars.length - 1; i >= 0; i--) {
            stack.push(chars[i]);
        }
        Stack<Character> lStack = new Stack();
        while(!stack.isEmpty()) {
            Character aChar = stack.pop();
            if(isRight(aChar) && !lStack.isEmpty()) {
                char c = lStack.peek();
                if(!isMatch(c,aChar)) {
                    break;
                }
                lStack.pop();
            }else {
                lStack.push(aChar);
            }
        }
        return lStack.isEmpty() && stack.isEmpty();
    }

    private static boolean isMatch(char left,char right) {
        for (char c : b1) {
            if(b1[0] == left && b1[1] == right) {
                return true;
            }
        }
        for (char c : b2) {
            if(b2[0] == left && b2[1] == right) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRight(char c) {
        for (int i = 0; i < b1.length; i++) {
            if(b1[i] == c) {
                return i == 1;
            }
        }
        for (int i = 0; i < b2.length; i++) {
            if(b2[i] == c) {
                return i == 1;
            }
        }
        return false;
    }
}
