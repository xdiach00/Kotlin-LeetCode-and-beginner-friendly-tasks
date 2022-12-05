package tasks

fun exercise51() {
    val employeesList = listOf("John", "Jane", "Jack", "Jill", "Joe")
    val salariesList = listOf(100, 200, 300, 400, 500)
    val employeesMap = mutableMapOf<String, Int>()

    employeesList.forEachIndexed { index, employee ->
        employeesMap[employee] = salariesList[index]
    }

    println(employeesMap)
}