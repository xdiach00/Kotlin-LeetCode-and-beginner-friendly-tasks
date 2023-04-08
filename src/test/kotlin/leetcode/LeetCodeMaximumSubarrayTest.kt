package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
*   53. Maximum Subarray - https://leetcode.com/problems/maximum-subarray/
*   The main idea of the solution is to iterate through the array and skip all prefix subarrays with negative sum.
*   On each iteration we calculate the sum of the current subarray and compare it with the maximum sum.
*   If the sum is lower than 0, we can skip the current subarray and start a new one.
*   Time complexity: O(n)
*/

class LeetCodeMaximumSubarrayTest {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = nums[0]
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            if (sum > maxSum) {
                maxSum = sum
            }
            if (sum < 0) {
                sum = 0
            }
        }
        return maxSum
    }

    @Test
    fun `Example 1`() {
        val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
        val output = 6
        val result = maxSubArray(nums)
        assertEquals(output, result)
    }

    @Test
    fun `Example 2`() {
        val nums = intArrayOf(1)
        val output = 1
        val result = maxSubArray(nums)
        assertEquals(output, result)
    }

    @Test
    fun `Example 3`() {
        val nums = intArrayOf(5,4,-1,7,8)
        val output = 23
        val result = maxSubArray(nums)
        assertEquals(output, result)
    }
}