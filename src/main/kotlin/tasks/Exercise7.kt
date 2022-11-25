/**
 * Calculate the laptop price with tax
 */
package tasks

fun exercise7() {
    print("Enter the laptop price: ")
    val price = readln().toDouble()
    print("Enter the tax rate: ")
    val tax = readln().toDouble()
    val priceWithTax = price * (1 + tax / 100)

    println("The price with tax is $priceWithTax")
}
