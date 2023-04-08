package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
* 121. Best Time to Buy and Sell Stock - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

class LeetCodeBestTimeToBuyAndSellStockTest {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0
        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            }
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice
            }
        }
        return maxProfit
    }

    @Test
    fun `Example1`() {
        val input = intArrayOf(7, 1, 5, 3, 6, 4)
        val output = 5
        val result = maxProfit(input)
        assertEquals(output, result)
    }

    @Test
    fun `Example2`() {
        val input = intArrayOf(7, 6, 4, 3, 1)
        val output = 0
        val result = maxProfit(input)
        assertEquals(output, result)
    }

    @Test
    fun `CustomExample1`() {
        val input = intArrayOf(2, 7, 1, 5)
        val output = 5
        val result = maxProfit(input)
        assertEquals(output, result)
    }
}