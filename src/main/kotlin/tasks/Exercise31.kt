package tasks

import kotlin.math.max

fun exercise31() {
    var workers = listOf<String>()
    while (true) {
        val input = run {
            print("Input worker, salary: ")
            readln()
        }
        if (input.lowercase() == "quit") break
        else {
            workers += input
        }
    }

    var maxSalary = 0

    for (i in workers.indices) {
        val current = workers[i].split(", ")[1].toInt()
        if (current > maxSalary) maxSalary = current
    }

    for (i in workers.indices) {
        val current = workers[i].split(", ")
        if (current[1].toInt() == maxSalary) print("${ current[0] } - ${ current[1] }, ")
    }
}