package tasks

fun exercise53() {
    val employeesList = listOf("John", "Jane", "Jack", "Jill", "Joe")
    val salariesList = listOf(100, 200, 300, 400, 500)
    val daysMissedList = listOf(5, 2, 1, 4, 3)

    val employeesMap = mutableMapOf<String, Any>()

    employeesList.forEachIndexed { index, employee ->
        employeesMap[employee] = mutableMapOf<String, Any>()
        (employeesMap[employee] as MutableMap<String, Any>)["salary"] = salariesList[index]
        (employeesMap[employee] as MutableMap<String, Any>)["daysMissed"] = daysMissedList[index]
    }

    var minDays = 1000
    var bestEmployee: String = ""
    employeesMap.forEach { (employee, employeeInfo) ->
        val daysMissed = (employeeInfo as Map<String, Any>)["daysMissed"] as Int
        if (daysMissed < minDays) {
            minDays = (employeeInfo as MutableMap<String, Any>)["daysMissed"] as Int
            bestEmployee = employee
        }
    }

    println(bestEmployee)
}