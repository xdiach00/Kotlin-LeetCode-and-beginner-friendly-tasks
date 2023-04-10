package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
*   371. Sum of Two Integers - https://leetcode.com/problems/sum-of-two-integers/
*   The idea is to use bit manipulation. XOR will give us a sum without carrying, and AND
*   with shifting by 1 will give us the carry.
*   For example:
*       1) 2 = 0010
*       2) 3 = 0011
*       3) 0010 ^ 0011 = 0001 (XOR gives sum without carry)
*       4) 0010 & 0011 << 1 = 0100 (AND with SHL by 1 gives carry)
*       5) 0001 ^ 0100 = 0101 (sum with carry)
*       6) 0101 = 5 (final result)
*/

class LeetCodeSumOfTwoIntegersTest {
    fun getSum(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b != 0) {
            val tmp = (a and b) shl 1
            a = a xor b
            b = tmp
        }
        return a
    }

    @Test
    fun `Example1`() {
        val a = 1
        val b = 2
        val output = 3
        val result = getSum(a, b)
        assertEquals(output, result)
    }

    @Test
    fun `Example2`() {
        val a = 2
        val b = 3
        val output = 5
        val result = getSum(a, b)
        assertEquals(output, result)
    }

}