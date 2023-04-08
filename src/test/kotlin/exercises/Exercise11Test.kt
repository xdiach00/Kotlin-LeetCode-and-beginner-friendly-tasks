package exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import tasks.exercise11

class Exercise11Test {
    @Test
    @DisplayName("Correct value for the hours = 3 and rate = 300")
    fun test1() {
        val result = exercise11(3, 300)
        assertEquals("I can buy 4 PS4, 1 Samsung, 1 TV, 90 game skin", result)
    }

    @Test
    @DisplayName("Correct value for the hours = 3 and rate 303")
    fun test2() {
        val result = exercise11(3, 303)
        assertEquals("I can buy 4 PS4, 1 Samsung, 1 TV, 90 game skin", result)
    }
}