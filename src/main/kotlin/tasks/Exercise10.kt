/**
 * Print last digit of a given number
 */
package tasks

fun exercise10() {
    print("Enter a number: ")
    val number = readln().toInt()
    val lastDigit = number % 10

    println("The last digit of $number is $lastDigit")
}

