package com.example.p2;

import java.util.Stack;

class Solution {
    public String solution(String p) {
        if (isRight(p)) {
            return p;
        }

        var index = balance(p);
        var u = p.substring(0, index);
        var v = p.substring(index);

        var vRight = solution(v);

        if (isRight(u)) {
            return u + vRight;
        } else {
            return "(" + vRight + ")" + reverse(u.substring(1, u.length() - 1));
        }
    }

    public boolean isRight(String p) {
        var stack = new Stack<Character>();

        for (Character c: p.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            var top = stack.peek();

            if (top.equals('(') && c.equals(')')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public int balance(String p) {
        var open = 0;
        var close = 0;

        for (var i=0; i<p.length(); i++) {
            var c = p.charAt(i);

            if (c == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                return i + 1;
            }
        }

        return p.length();
    }

    public String reverse(String p) {
        var c = new char[p.length()];

        for (var i=0; i<p.length(); i++) {
            if (p.charAt(i) == '(') {
                c[i] = ')';
            } else {
                c[i] = '(';
            }
        }

        return new String(c);
    }
}