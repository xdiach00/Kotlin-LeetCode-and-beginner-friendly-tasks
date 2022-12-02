package tasks

fun exercise33() {
    var workers = listOf<String>()
    var salaries = listOf<Int>()
    while (true) {
        print("Enter worker, salary: ")
        val input = readln()
        if (input.lowercase() == "quit") break
        else {
            workers += input.split(", ")[0]
            salaries += input.split(", ")[1].toInt()
        }
    }
    print("${ salaries.size } employees and the total amount of salaries is ${ salaries.sumOf { it } }$")
}