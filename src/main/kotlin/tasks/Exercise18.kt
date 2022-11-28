package tasks

fun exercise18()  {
    var result = 0
    for (i in 1..101 step 2) {
        result += i
    }

    print("The sum is $result")
}