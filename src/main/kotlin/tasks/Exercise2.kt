/**
 * Calculate average of grades
 */
package tasks

fun exercise2() {
    print("Enter your Geometry score: ")
    val geometry = readln().toInt()
    print("Enter your Algebra score: ")
    val algebra = readln().toInt()
    print("Enter your Physics score: ")
    val physics = readln().toInt()

    val averageScore = (geometry + algebra + physics) / 3
    println("Your average score is $averageScore")
}
