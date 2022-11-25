/**
 * Count possible amount of cryptocurrencies
 */
package tasks

import kotlin.math.floor

fun exercise6() {
    print("Enter the amount of money: ")
    val money = readln().toFloat()
    print("Enter the price of Bitcoin: ")
    val bitcoin = readln().toFloat()
    print("Enter the price of Ethereum: ")
    val ethereum = readln().toFloat()
    print("Enter the price of Litecoin: ")
    val litecoin = readln().toFloat()

    val bitcoinAmount = floor(money / bitcoin).toInt()
    val ethereumAmount = floor(money / ethereum).toInt()
    val litecoinAmount = floor(money / litecoin).toInt()

    println("With $money$ you can buy: $bitcoinAmount Bitcoins, $ethereumAmount Ethereum and $litecoinAmount Litecoins")
}
