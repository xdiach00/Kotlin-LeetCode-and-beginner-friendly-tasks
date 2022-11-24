/**
 * Calculate average with custom output
 */
package tasks

fun exercise3() {
    print("Enter your Geometry score: ")
    val geometry = readln().toInt()
    print("Enter your Algebra score: ")
    val algebra = readln().toInt()
    print("Enter your Physics score: ")
    val physics = readln().toInt()

    val averageScore = (geometry + algebra + physics) / 3
    print("Your average score is $averageScore, ")
    when {
        averageScore >= 7 -> println("Good job!")
        averageScore >= 4 -> println("You need to work harder!")
        else -> println("Failed, you really need to work harder!")
    }
}
