package exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import tasks.exercise16

class Exercise16Test {

    @Test
    @DisplayName("Show correct prices")
    fun test1() {
        assertEquals("Burger 5.0$", exercise16("Burger"))
        assertEquals("Pizza 3.0$", exercise16("Pizza"))
        assertEquals("Hot Dog 1.5$", exercise16("Hot Dog"))
    }
}