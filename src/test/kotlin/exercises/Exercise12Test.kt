package exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import tasks.exercise12

class Exercise12Test {

    @Test
    @DisplayName("Correct output for Memes Consumption > Wikipedia Consumption")
    fun test1() {
        val result = exercise12(100, 201)
        assertEquals("WOW MANY MEMES \n SUCH LOL", result)
    }

    @Test
    @DisplayName("Correct output for Total Consumption > 100")
    fun test2() {
        val result = exercise12(1000, 1000)
        assertEquals("Too much consumption", result)
    }
}