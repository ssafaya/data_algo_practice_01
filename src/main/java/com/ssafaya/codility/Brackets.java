package com.ssafaya.codility;

import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {

    }

    public int solution(String S) {

        Stack<Character> s = new Stack();
        char[] arr = S.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            } else {
                if(!valid(s, ch)) {
                    return 0;
                }
            }
        }

        return (s.size() == 0) ? 1 : 0;
    }

    private boolean valid(Stack<Character> st, Character ch) {
        if(st.size() == 0) {
            return false;
        }
        Character poppedCh = st.pop();
        return (poppedCh == '{' && ch == '}')
                || (poppedCh == '[' && ch == ']')
                || (poppedCh == '(' && ch == ')');
    }
}