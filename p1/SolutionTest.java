package com.example.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testSomething() {
        var solution = new Solution();

        assertEquals(1, solution.solution("a"));
        assertEquals(7, solution.solution("aabbaccc"));
        assertEquals(9, solution.solution("ababcdcdababcdcd"));
        assertEquals(8, solution.solution("abcabcdede"));
        assertEquals(14, solution.solution("abcabcabcabcdededededede"));
        assertEquals(17, solution.solution("xababcdcdababcdcd"));
        assertEquals(3, solution.solution("aaaaaaaaaaa"));
    }
}