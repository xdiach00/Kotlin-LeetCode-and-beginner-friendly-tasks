package exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import tasks.exercise14

class Exercise14Test {

    @Test
    @DisplayName("20$ and shipping to Canada")
    fun test1() {
        val result = exercise14(20, "Canada")
        assertEquals("You have to pay 23$, 20$ for the product and 3$ for shipping cost", result)
    }

    @Test
    @DisplayName("30$ and shipping to US")
    fun test2() {
        val result = exercise14(30, "US")
        assertEquals("You have to pay 35$, 30$ for the product and 5$ for shipping cost", result)
    }

    @Test
    @DisplayName("40$ and shipping to Europe")
    fun test3() {
        val result = exercise14(40, "Europe")
        assertEquals("You have to pay 47$, 40$ for the product and 7$ for shipping cost", result)
    }

    @Test
    @DisplayName("100$ and shipping to China")
    fun test4() {
        val result = exercise14(100, "China")
        assertEquals("You have to pay 109$, 100$ for the product and 9$ for shipping cost", result)
    }
}