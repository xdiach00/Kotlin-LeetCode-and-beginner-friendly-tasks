package exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import tasks.exercise19

class Exercise19Test {

    @Test
    @DisplayName("N is 100")
    fun test1() {
        val result = exercise19(100)
        assertEquals("The sum is 5050", result)
    }
}