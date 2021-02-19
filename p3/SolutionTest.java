package com.example.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testRotate() {
        var solution = new Solution();

        assertEquals("0000000000010000", solution.toString(solution.rotate(
                new int[][]{{0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}
        )));

        assertEquals("010100100", solution.toString(solution.rotate(
                new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}}
        )));
    }

    @Test
    public void testSolution() {
        var solution = new Solution();

        assertTrue(solution.solution(
                new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}},
                new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}
        ));

        assertTrue(solution.solution(
                new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}
        ));

        assertFalse(solution.solution(
                new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 0}},
                new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}
        ));

        assertTrue(solution.solution(
                new int[][]{{1, 1, 0}, {0, 0, 0}, {0, 0, 0}},
                new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 1, 0}}
        ));

        assertFalse(solution.solution(
                new int[][]{{1, 0, 1}, {0, 0, 0}, {0, 0, 0}},
                new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 1, 0}}
        ));

        assertTrue(solution.solution(
                new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}},
                new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}
        ));

        assertTrue(solution.solution(
                new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}},
                new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 0}, {1, 1, 0, 1}}
        ));

        assertTrue(solution.solution(
                new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}},
                new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 1, 1}}
        ));

        assertTrue(solution.solution(
                new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}},
                new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 0}, {1, 1, 1, 1}}
        ));
    }

    @Test
    public void testSolution2() {
        var solution = new Solution();

        assertTrue(solution.solution(
                new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}},
                new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 1, 1}}
        ));

    }
}