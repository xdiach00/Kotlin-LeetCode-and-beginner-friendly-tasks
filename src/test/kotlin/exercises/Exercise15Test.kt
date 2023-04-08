package exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import tasks.exercise15

class Exercise15Test {

    @Test
    @DisplayName("500 minutes")
    fun test1() {
        val result = exercise15(500)
        assertEquals("Total amount: 5.0$", result)
    }

    @Test
    @DisplayName("800 minutes")
    fun test2() {
        val result = exercise15(800)
        assertEquals("Total amount: 7.4$", result)
    }

    @Test
    @DisplayName("1000 minutes")
    fun test3() {
        val result= exercise15(1000)
        assertEquals("Total amount: 8.4$", result)
    }
}