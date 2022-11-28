package tasks

fun exercise19(n: Int? = null): String {
    val num = n ?: run {
        print("Enter n: ")
        readln().toInt()
    }

    var result = 0
    for (i in 1..num) {
        result += i
    }

    return("The sum is $result")
}