package tasks

fun exercise26() {
    var cnt = 0
    var average = 0.0
    while (true) {
        val input = run {
            print("Enter the price of apartments to register: ")
            readln().toInt()
        }
        if (input > 0) {
            cnt++
            average += input
        } else {
            break
        }
    }
    average /= cnt
    println("$cnt apartments have registered. The average price for rent is $average")

    while (true) {
        val input = run {
            print("Enter the price of apartments you want to rent: ")
            readln().toInt()
        }
        if (input <= 0) {
            print("Quit program")
            return
        } else {
            if (input > average) println("Above average price")
            else if (input < average) println("Below average price")
        }
    }
}