package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
*   217. Contains Duplicate - https://leetcode.com/problems/contains-duplicate/
*
*   HashSet is a data structure that stores unique elements.
*   HashSet hashes the elements and stores them in a bucket.
*   If the element is already present in the bucket, it is not added.
*/

class LeetCodeContainsDuplicateTest {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        for (num in nums) {
            if (set.contains(num)) {
                return true
            }
            set.add(num)
        }
        return false
    }

    @Test
    fun `Example1`() {
        val input = intArrayOf(1, 2, 3, 1)
        val output = true
        val result = containsDuplicate(input)
        assertEquals(output, result)
    }

    @Test
    fun `Example2`() {
        val input = intArrayOf(1, 2, 3, 4)
        val output = false
        val result = containsDuplicate(input)
        assertEquals(output, result)
    }

    @Test
    fun `Example3`() {
        val input = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        val output = true
        val result = containsDuplicate(input)
        assertEquals(output, result)
    }
}