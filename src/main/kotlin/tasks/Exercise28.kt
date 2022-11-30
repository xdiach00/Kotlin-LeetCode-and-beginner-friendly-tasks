package tasks

fun exercise28() {
    while (true) {
        print("Enter seconds: ")
        val seconds = readln().toInt()
        if (seconds > 0) {
            for (i in seconds downTo 1) print("$i, ")
            println("Go!")
        } else {
            print("Exit program!")
            return
        }
    }
}