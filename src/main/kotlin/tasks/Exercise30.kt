package tasks

import java.util.Collections.max

fun exercise30() {
    print("Enter names divided with commas and spaces: ")
    val names = readln().split(", ")
    print("Enter salary divided with commas and spaces: ")
    val salary = readln().split(", ").map { it.toInt() }

    val maxSalary = max(salary)
    for (i in salary.indices) {
        if (salary[i] == maxSalary)
            print("${ names[i] } - ${ salary[i] }, ")
    }
}