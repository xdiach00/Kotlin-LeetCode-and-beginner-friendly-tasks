import tasks.*

fun main() {
    print("Enter task number: ")
    when (readln().toInt()) {
        1 -> exercise1()
        2 -> exercise2()
        else -> println("No such task")
    }
}
