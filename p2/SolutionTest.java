package com.example.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testIsRight() {
        var solution = new Solution();

        assertEquals(true, solution.isRight("()"));
        assertEquals(false, solution.isRight(")("));
        assertEquals(false, solution.isRight("(("));
        assertEquals(true, solution.isRight("((()()))"));
        assertEquals(false, solution.isRight(")(()())("));
        assertEquals(true, solution.isRight("()(())()"));
    }

    @Test
    public void testBalance() {
        var solution = new Solution();

        assertEquals(2, solution.balance("()"));
        assertEquals(2, solution.balance(")("));
        assertEquals(4, solution.balance("(())"));
        assertEquals(4, solution.balance("))(("));
        assertEquals(8, solution.balance("((()()))"));
        assertEquals(2, solution.balance(")()("));
        assertEquals(4, solution.balance("))(((((())))"));
    }

    @Test
    public void testSolution() {
        var solution = new Solution();

        assertEquals("(()())()", solution.solution("(()())()"));
        assertEquals("()", solution.solution(")("));
        assertEquals("(())()", solution.solution("))((()"));
        assertEquals("()(())()", solution.solution("()))((()"));
    }
}