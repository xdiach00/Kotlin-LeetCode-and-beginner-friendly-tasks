package exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import tasks.exercise37

class Exercise37Test {

    @Test
    @DisplayName("Workers: [Jan, Huan, Kyle, Petr], Salaries: [800, 500, 900, 300]")
    fun test1() {
        val workers = mutableListOf("Jan", "Huan", "Kyle", "Petr")
        val salaries = mutableListOf(800, 500, 900, 300)
        val assertList = mutableListOf("Petr", "Huan", "Jan", "Kyle")

        val result = exercise37(workers, salaries)

        assertEquals(assertList, result)
    }
}