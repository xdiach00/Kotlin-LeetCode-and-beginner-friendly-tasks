package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
*   219. Contains Duplicate II - https://leetcode.com/problems/contains-duplicate-ii/
*/

class LeetCodeContainsDuplicate2Test {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(nums[i]) && i - map[nums[i]]!! <= k) {  // map[nums[i]]!! is the value of the key nums[i]
                return true
            }
            map[nums[i]] = i
        }
        return false
    }

    @Test
    fun `Example1`() {
        val input = intArrayOf(1, 2, 3, 1)
        val k = 3
        val output = true
        val result = containsNearbyDuplicate(input, k)
        assertEquals(output, result)
    }

    @Test
    fun `Example2`() {
        val input = intArrayOf(1, 0, 1, 1)
        val k = 1
        val output = true
        val result = containsNearbyDuplicate(input, k)
        assertEquals(output, result)
    }

    @Test
    fun `Example3`() {
        val input = intArrayOf(1, 2, 3, 1, 2, 3)
        val k = 2
        val output = false
        val result = containsNearbyDuplicate(input, k)
        assertEquals(output, result)
    }
}