/**
 * Calculate calls price
 */
package tasks

fun exercise15(minutes: Int? = null): String {
    val minutesTotal = minutes ?: run {
        print("Enter the total calls duration: ")
        readln().toInt()
    }

    fun countPrice(minutes: Int): Double {
        return if (minutes <= 500) minutes * 0.01
        else if (minutes <= 800) (minutes - 500) * 0.008 + countPrice(500)
        else (minutes - 800) * 0.005 + countPrice(800)
    }

    return("Total amount: ${countPrice(minutesTotal)}$")
}