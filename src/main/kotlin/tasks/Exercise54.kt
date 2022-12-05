package tasks

fun exercise54() {
    val employeesList = listOf("John", "Jane", "Jack", "Jill", "Joe")
    val salariesList = listOf(1000, 200, 300, 400, 500)
    val daysMissedList = listOf(5, 1, 1, 4, 1)

    val employeesMap = mutableMapOf<String, Any>()

    employeesList.forEachIndexed { index, employee ->
        employeesMap[employee] = mutableMapOf<String, Any>()
        (employeesMap[employee] as MutableMap<String, Any>)["salary"] = salariesList[index]
        (employeesMap[employee] as MutableMap<String, Any>)["daysMissed"] = daysMissedList[index]
    }

    var minDays = 1000
    var minSalary = 1000
    var bestEmployee = ""
    var bestEmployeeInfo = mutableMapOf<String, Any>()

    employeesMap.forEach { (employee, employeeInfo) ->
        val daysMissed = (employeeInfo as Map<String, Any>)["daysMissed"] as Int
        val lowestSalary = employeeInfo["salary"] as Int
        if (lowestSalary < minSalary) {
            if (daysMissed < minDays) {
                minDays = (employeeInfo as MutableMap<String, Any>)["daysMissed"] as Int
                minSalary = employeeInfo["salary"] as Int
                bestEmployee = employee
                bestEmployeeInfo = employeeInfo
            }
        }
    }
    bestEmployeeInfo["salary"] = (bestEmployeeInfo["salary"] as Int * 1.1).toInt()
    employeesMap[bestEmployee] = bestEmployeeInfo
    println(employeesMap[bestEmployee])
}
