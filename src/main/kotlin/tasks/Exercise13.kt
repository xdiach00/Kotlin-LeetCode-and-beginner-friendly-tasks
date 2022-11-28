package tasks

fun exercise13(hours: Int? = null, member: Boolean? = null): String {
    val hoursSpend = hours ?: run {
        print("Enter a number of hours spend: ")
        readln().toInt()
    }
    val memberCheck = member ?: run {
        print("Is user a member(y/n)?: ")
        readln().lowercase() == "y"
    }
    val taxRate = if (memberCheck) {
        10.0
    } else {
        20.0
    }
    val hourPrice = if (memberCheck) {
        2
    } else {
        5
    }
    val totalPrice = (hoursSpend * hourPrice) * (taxRate / 100 + 1)

    return ("The user ${
        if (memberCheck) {
            "is"
        } else {
            "is not"
        }
    } a member stayed $hoursSpend hours for $hourPrice$/hour plus the ${taxRate.toInt()}% the total amount is $totalPrice$")
}