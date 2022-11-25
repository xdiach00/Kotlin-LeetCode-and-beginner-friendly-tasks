package tasks

fun exercise8() {
    print("Enter the number of years employed: ")
    val years = readln().toInt()
    print("Enter the number of children: ")
    val children = readln().toInt()

    val yearsCost = years * 20
    val childrenCost = children * 30
    val salary = 400 + yearsCost + childrenCost

    println("The total amount is $salary$. 400$ minimum wage + $yearsCost$ for $years years of employment + $childrenCost$ for $children kids")
}
