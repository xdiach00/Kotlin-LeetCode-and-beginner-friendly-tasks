package tasks

fun exercise36() {
    var workers = mutableListOf<String>()
    var workersNew = mutableListOf<String>()
    var salaries = mutableListOf<Double>()
    while (true) {
        print("Enter worker, salary: ")
        val input = readln()
        if (input.lowercase() == "quit") break
        else {
            workers += input.split(", ")[0]
            salaries += input.split(", ")[1].toDouble()
        }
        print("Do you want to continue(yes/no)?: ")
        if (readln().lowercase() != "yes") break
    }
    var average = salaries.sumOf { it } / salaries.size
    println("The average salary is $average$")
    var sizeArr = workers.size - 1
    var i = 0
    while (i <= sizeArr){
        if (salaries[i] > average) {
            print("${ workers[i] }'s salary is above average. ")
            workersNew += workers[i]
            workers.remove(workers[i])
            salaries.remove(salaries[i])
            sizeArr--
            i--
        } else if(salaries[i] == average) {
            print("${ workers[i] }'s salary is equals average. ")
        } else {
            print("${ workers[i] }'s salary is below average. ")
        }
        i++
    }
    println()
    print("Total Employees: ${ workers.size }, Removed Employees: ${ workersNew.size }")
}