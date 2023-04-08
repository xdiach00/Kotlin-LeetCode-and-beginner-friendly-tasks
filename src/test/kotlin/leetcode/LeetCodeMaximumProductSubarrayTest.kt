package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.math.max
import kotlin.math.min

/*
*	152. Maximum Product Subarray - https://leetcode.com/problems/maximum-product-subarray/description/
* 	The main idea is to calculate both maximum and minimum for current prefix subarray. We need to store both of them
* 	for the case of getting negative numbers.
*/

class LeetCodeMaximumProductSubarrayTest {
    fun maxProduct(nums: IntArray): Int {
    	var currentMin = 1
		var currentMax = 1
		var result = nums.max()!!

		for (num in nums) {
			val maxTmp = num * currentMax
			currentMax = max(num * currentMax, max(num * currentMin, num))
			currentMin = min(maxTmp, min(num * currentMin, num))
			result = max(result, currentMax)!!
		}
		return result!!
    }

	@Test
	fun `Example 1`() {
		val input = intArrayOf(2,3,-2,4)
		val output = 6
		val result = maxProduct(input)
		assertEquals(output, result)
	}

	@Test
	fun `Example 2`() {
		val input = intArrayOf(-2,0,-1)
		val output = 0
		val result = maxProduct(input)
		assertEquals(output, result)
	}

	@Test
	fun `Example 3`() {
		val input = intArrayOf(-4,-3,-2)
		val output = 12
		val result = maxProduct(input)
		assertEquals(output, result)
	}

	@Test
	fun `Custom Example 1`() {
		val input = intArrayOf(10, 9, 0, 3, 11)
		val output = 110
		val result = maxProduct(input)
		assertEquals(output, result)
	}
}
