package tasks

fun exercise16(foodName: String? = null): String {
    val food = HashMap<String, Double>()
        food["Burger"] = 5.0
        food["Pizza"] = 3.0
        food["Hot Dog"] = 1.5

    val mealName = foodName ?: run {
        print("Input a meal you want (Burger/Pizza/Hot Dog): ")
        readln()
    }

    return("$mealName ${food[mealName]}$")
}