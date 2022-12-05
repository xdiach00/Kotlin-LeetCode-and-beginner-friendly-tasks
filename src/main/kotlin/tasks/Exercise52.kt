package tasks

fun exercise52() {
    val employeesList = listOf("John", "Jane", "Jack", "Jill", "Joe")
    val salariesList = listOf(100, 200, 300, 400, 500)
    val daysMissedList = listOf(1, 2, 3, 4, 5)

    val employeesMap = mutableMapOf<String, Any>()

    employeesList.forEachIndexed { index, employee ->
//        employeesMap[employee] = listOf(salariesList[index], daysMissedList[index]) -- adds a list of salaries and days missed to each employee
        employeesMap[employee] = mutableMapOf<String, Any>() // -- adds a map of salaries and days missed to each employee
        (employeesMap[employee] as MutableMap<String, Any>)["salary"] = salariesList[index] // sets the salary for each employee in the map of salaries and days missed
        (employeesMap[employee] as MutableMap<String, Any>)["daysMissed"] = daysMissedList[index] // sets the days missed for each employee in the map of salaries and days missed
    }

    println(employeesMap)
}