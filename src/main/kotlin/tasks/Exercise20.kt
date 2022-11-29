package tasks

fun exercise20() {
    val num = run {
        print("Input the number you want ot sum: ")
        readln().toInt()
    }

    var sum = 0.0
    var cnt = 0

    for (i in 1..num) {
        sum += i
        cnt++
    }

    var average: Double = sum / cnt

    println("The sum is $sum")
    println("The average is $average")
}