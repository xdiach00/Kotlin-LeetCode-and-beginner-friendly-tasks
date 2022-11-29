package tasks

fun exercise22() {
    val input = run {
        print("Input 5 numbers divided by commas and spaces: ")
        readln()
    }

    val numbersArray = input.split(", ").map { it.toInt() }
    for (i in numbersArray) {
        if (i < 0) print("Negative ") else print("Positive ")
    }
}
