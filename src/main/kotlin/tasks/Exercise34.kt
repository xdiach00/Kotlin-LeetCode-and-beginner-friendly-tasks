package tasks

fun exercise34() {
    var workers = listOf<String>()
    var salaries = listOf<Double>()
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
    for (i in workers.indices){
        if (salaries[i] > average) {
            print("${ workers[i] }'s salary is above average. ")
        } else if(salaries[i] == average) {
            print("${ workers[i] }'s salary is equals average. ")
        } else {
            print("${ workers[i] }'s salary is below average. ")
        }
    }
}