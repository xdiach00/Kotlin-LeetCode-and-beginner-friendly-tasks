/**
 *  Switch the values of the variables a and b.
 */
package tasks

// with a temporary variable
//fun exercise1() {
//    print("Enter a: ")
//    var a = readln().toInt()
//    print("Enter b: ")
//    var b = readln().toInt()
//    val c = a
//    a = b
//    b = c
//    println("a is $a, b is $b")
//}

// without a temporary variable using inline fun <T> T.also(block: (T) -> Unit): T
fun exercise1() {
    print("Enter a: ")
    var a = readln().toInt()
    print("Enter b: ")
    var b = readln().toInt()
    a = b.also { b = a }
    println("a is $a, b is $b")
}
