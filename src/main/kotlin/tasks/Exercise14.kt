package tasks

fun exercise14(price: Int? = null, location: String? = null): String {
    val productPrice = price ?: run {
        print("Enter the product's price: ")
        readln().toInt()
    }
    val customerLocation = location?.lowercase() ?: run {
        print("Enter your location: ")
        readln().lowercase()
    }
    val shippingCost = when(customerLocation) {
        "us" -> 5
        "europe" -> 7
        "canada" -> 3
        else -> 9
    }
    val totalPrice = productPrice + shippingCost

    return("You have to pay $totalPrice$, $productPrice$ for the product and $shippingCost$ for shipping cost")
}
