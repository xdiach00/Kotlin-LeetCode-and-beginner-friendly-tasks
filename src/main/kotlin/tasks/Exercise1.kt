/**
 *  Switch the values of the variables a and b.
 */
package tasks

// with a temporary variable
fun Exercise1() {
    print("Enter a: ")
    var a = readln().toInt()
    print("Enter b: ")
    var b = readln().toInt()
    val c = a
    a = b
    b = c
    println("a is $a, b is $b")
}
