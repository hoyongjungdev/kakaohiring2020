package com.example.p1;

class Solution {
    public int solution(String s) {
        var length = s.length();
        var ans = Integer.MAX_VALUE;

        for (var i=1; i <= Math.max(1, length / 2); i++) {
            ans = Math.min(ans, zipByLength(s, i));
        }

        return ans;
    }

    public int zipByLength(String s, int len) {
        var fullLength = s.length();

        var before = "";
        var duplicateNum = 0;

        var result = "";

        for (var i=0; i < fullLength; i += len) {
            String sub = s.substring(i, Math.min(i+len, fullLength));

            if (before.equals(sub)) {
                duplicateNum++;
            } else {
                if (duplicateNum > 1) {
                    result += duplicateNum;
                }
                result += before;
                before = sub;
                duplicateNum = 1;
            }
        }

        if (duplicateNum > 1) {
            result += duplicateNum;
        }
        result += before;

        return result.length();
    }
}