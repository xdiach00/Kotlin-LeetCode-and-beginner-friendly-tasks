package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
*   70. Climbing Stairs - https://leetcode.com/problems/climbing-stairs/
*/

class LeetCodeClimbingStairsTest {
    fun climbStairs(n: Int): Int {
        if (n == 1) return 1
        var first = 1
        var second = 2
        for (i in 3..n) {
            val tmp = first + second
            first = second
            second = tmp
        }
        return second
    }

    @Test
    fun `Example1`() {
        val n = 2
        val output = 2
        val result = climbStairs(n)
        assertEquals(output, result)
    }

    @Test
    fun `Example2`() {
        val n = 3
        val output = 3
        val result = climbStairs(n)
        assertEquals(output, result)
    }
}