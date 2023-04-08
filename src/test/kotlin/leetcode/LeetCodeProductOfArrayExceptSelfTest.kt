package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

/*
* 238. Product of Array Except Self - https://leetcode.com/problems/product-of-array-except-self/
* Main idea:
* 1. Create an array of the same size as the input array
* 2. Iterate over the input array, calculate the PREFIX product and store it in a result array (prefix is the product of all the elements to the left of the current element)
* 3. Iterate over the input array in reverse order and calculate the POSTFIX product (postfix is the product of all the elements to the right of the current element)
* 4. Multiply the prefix and postfix product for each element and store it in the result array
* 5. Return the result array
*/

class LeetCodeProductOfArrayExceptSelfTest {
    fun productExceptSelf(nums: IntArray): IntArray {
        val resultArray = IntArray(nums.size)
        var prefix = 1
        for (i in nums.indices) {
            resultArray[i] = prefix
            prefix *= nums[i]
        }
        var postfix = 1
        for (i in nums.size - 1 downTo 0) {
            resultArray[i] *= postfix
            postfix *= nums[i]
        }
        return resultArray
    }

    @Test
    fun `Example1`() {
        val input = intArrayOf(1, 2, 3, 4)
        val output = intArrayOf(24, 12, 8, 6)
        val result = productExceptSelf(input)
        assertArrayEquals(output, result)
    }

    @Test
    fun `Example2`() {
        val input = intArrayOf(-1, 1, 0, -3, 3)
        val output = intArrayOf(0, 0, 9, 0, 0)
        val result = productExceptSelf(input)
        assertArrayEquals(output, result)
    }
}