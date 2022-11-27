/**
 * Count how many devices can I buy
 */
package tasks

fun exercise11(hours: Int? = null, rate: Int? = null): String {
    if (hours == null || rate == null) {
        print("Enter the amount of hours you have worked: ")
        val hours = readln().toInt() // create a NEW local variable hours and assign it the value of the parameter hours
        print("Enter your hourly rate: ")
        val rate = readln().toInt() // create a NEW local variable rate and assign it the value of the parameter rate

        val totalMoney = hours * rate // create a new local variable totalMoney and assign it the value of the expression hours * rate

        return("I can buy ${totalMoney / 200} PS4, ${totalMoney / 900} Samsung, ${totalMoney / 500} TV, ${(totalMoney / 9.99).toInt()} game skin")
    } else {
        val totalMoney = hours * rate // create a new local variable totalMoney and assign it the value of the hours * rate, given as FUNCTION ARGUMENTS

        return("I can buy ${totalMoney / 200} PS4, ${totalMoney / 900} Samsung, ${totalMoney / 500} TV, ${(totalMoney / 9.99).toInt()} game skin")
    }
}
