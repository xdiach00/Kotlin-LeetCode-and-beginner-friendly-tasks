import tasks.exercise1

fun main() {
    print("Enter task number: ")
    when (readln().toInt()) {
        1 -> exercise1()
        else -> println("No such task")
    }
}