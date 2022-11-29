package tasks

fun exercise21() {
    val input = run {
        print("Input 5 numbers divided by commas and spaces: ")
        readln()
    }

    val numbersArray = input.split(", ").map { it.toInt() }
    val result = numbersArray.sum() / 5.0

    print("The average is $result")
}