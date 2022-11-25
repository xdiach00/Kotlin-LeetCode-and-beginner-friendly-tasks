import tasks.*

fun main() {
    print("Enter task number: ")
    when (readln().toInt()) {
        1 -> exercise1()
        2 -> exercise2()
        3 -> exercise3()
        4 -> exercise4()
        5 -> exercise5()
        6 -> exercise6()
        7 -> exercise7()
        8 -> exercise8()
        9 -> exercise9()
        else -> println("No such task")
    }
}
