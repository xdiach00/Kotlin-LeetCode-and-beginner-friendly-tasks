package tasks

fun exercise29() {
    fun calculateSum(hours: Int): Double {
        when {
            hours == 1 -> return (2.0)
            hours == 2 -> return (1.5 + calculateSum(1))
            hours == 3 -> return (1 + calculateSum(2))
            hours >= 4 -> return ((hours - 3) * 0.5 + calculateSum(3))
        }
        return (0.0)
    }

    var totalAmount = 0.0
    var driversCnt = 0

    while (true) {
        var fixed = 0.0
        while (true) {
            print("Is it a member?: ")
            val input = readln().lowercase()
            if (input == "yes") {
                driversCnt++
                fixed = 1.5
                break
            } else if (input == "no") {
                driversCnt++
                fixed = 3.0
                break
            }
        }
        val hoursSpend = run {
            print("Enter spend hours: ")
            readln().toInt()
        }
        totalAmount += fixed + calculateSum(hoursSpend)

        print("Do you want to continue(Yes/No)?: ")
        var answer = readln().lowercase()
        if (answer != "yes" && answer != "no") {
            while (true) {
                print("Enter yes or no!: ")
                answer = readln().lowercase()
                if (answer == "yes") break
                else if (answer == "no") break
            }
        }
        if (answer == "no") {
            print("$driversCnt Drivers payed. The total earnings are $totalAmount$")
            return
        }
    }

}