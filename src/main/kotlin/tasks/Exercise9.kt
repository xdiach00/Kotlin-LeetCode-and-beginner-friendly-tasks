package tasks

fun exercise9() {
    print("Enter the number of years employed: ")
    val years = readln().toInt()
    print("Enter the number of children: ")
    val children = readln().toInt()
    print("Enter the number of days missed: ")
    val dayMissed = readln().toInt()

    val yearsCost = years * 20
    val childrenCost = children * 30
    if (dayMissed == 0) {
        val salary = 400 + yearsCost + childrenCost + 100
        println("The total amount is $salary$. 400$ minimum wage + $yearsCost$ for $years years of employment + $childrenCost$ for $children kids + 100$ for not missing a day at work")
    } else {
        val salary = 400 + yearsCost + childrenCost
        println("The total amount is $salary$. 400$ minimum wage + $yearsCost$ for $years years of employment + $childrenCost$ for $children kids")
    }
}