package tasks

fun exercise23() {
    val input = run {
        print("Input numbers divided by commas and spaces: ")
        readln()
    }

    val numbersArray = input.split(", ").map { it.toInt() }
    var sum = 0
    for (i in numbersArray) {
        if (i < 0) print("The sum is $sum") else sum += i
    }
}