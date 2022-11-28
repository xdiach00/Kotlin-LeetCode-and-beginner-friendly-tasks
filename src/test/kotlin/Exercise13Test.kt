import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import tasks.exercise13

class Exercise13Test {

    @Test
    @DisplayName("The member stayed for 2 hours")
    fun test1() {
        val result = exercise13(2, true)
        assertEquals("The user is a member stayed 2 hours for 2$/hour plus the 10% the total amount is 4.4$", result)
    }

    @Test
    @DisplayName("Not a member stayed for 6 hours")
    fun test2() {
        val result = exercise13(6, false)
        assertEquals("The user is not a member stayed 6 hours for 5$/hour plus the 20% the total amount is 36.0$", result)
    }
}