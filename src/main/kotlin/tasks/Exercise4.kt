/**
 * Bitcoin increase or decrease counter
 */
package tasks

fun exercise4() {
    print("Enter the Bitcoin price at the time of purchase: ")
    val oldPrice = readln().toFloat()
    print("Enter the increase/decrease percentage: ")
    val totalPercentage = readln().toFloat()

    val newPrice = oldPrice * (1 + totalPercentage / 100)
    val priceDifference = newPrice - oldPrice

    println("The new price is $newPrice, difference is $priceDifference")
}
