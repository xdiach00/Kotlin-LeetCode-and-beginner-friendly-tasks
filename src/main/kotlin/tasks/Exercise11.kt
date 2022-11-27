/**
 * Count how many devices can I buy
 */
package tasks

fun exercise11() {
    print("Enter the amount of hours you have worked: ")
    val hours = readln().toInt()
    print("Enter your hourly rate: ")
    val rate = readln().toInt()

    val totalMoney = hours * rate
    print("I can buy ${totalMoney / 200} PS4, ${totalMoney / 900} Samsung, ${totalMoney / 500} TV, ${(totalMoney / 9.99).toInt()} game skin")
}
