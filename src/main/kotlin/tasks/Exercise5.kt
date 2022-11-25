/**
 * Calculate the total area of property
 */
package tasks

fun exercise5() {
    print("Enter the width of the property: ")
    val width = readln().toFloat()
    print("Enter the height of the property: ")
    val height = readln().toFloat()

    print("The total area of the property is ${width * height}")
}
