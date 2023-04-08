package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
*  3. Longest Substring Without Repeating Characters - https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/

class LeetCodeLongestSubstringTest {
    fun lengthOfLongestSubstring(s: String): Int {
        val charSet = HashSet<Char>()
        var start = 0
        var end = 0
        var ans = 0

        while (end < s.length) {
            if (s[end] in charSet) {
                charSet.remove(s[start])
                start += 1
            }
            else {
                charSet.add(s[end])
                end += 1
                ans = maxOf(ans, end - start)
            }
        }
        return ans
    }

    @Test
    fun `Example1`() {
        val input = "abcabcbb"
        val output = 3
        val result = lengthOfLongestSubstring(input)
        assertEquals(output, result)
    }

    @Test
    fun `Example2`() {
        val input = "bbbbb"
        val output = 1
        val result = lengthOfLongestSubstring(input)
        assertEquals(output, result)
    }

    @Test
    fun `Example3`() {
        val input = "pwwkew"
        val output = 3
        val result = lengthOfLongestSubstring(input)
        assertEquals(output, result)
    }

    @Test
    fun `Example4`() {
        val input = " "
        val output = 1
        val result = lengthOfLongestSubstring(input)
        assertEquals(output, result)
    }
}
