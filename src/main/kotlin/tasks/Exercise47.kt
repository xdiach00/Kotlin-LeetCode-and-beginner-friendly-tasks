package tasks

class Ex47BankUser(
    val name: String,
) {
    var id: Int = 0
    var balance: Int = 0
}

fun exercise47() {
    val firstUser = Ex47BankUser("John")
    print("Set id for ${ firstUser.name }: ")
    firstUser.id = readln().toInt()
    print("Set balance for ${ firstUser.name }: ")
    firstUser.balance = readln().toInt()
    val secondUser = Ex47BankUser("Jane")
    print("Set id for ${ secondUser.name }: ")
    secondUser.id = readln().toInt()
    print("Set balance for ${ secondUser.name }: ")
    secondUser.balance = readln().toInt()

    println("First user: ${ firstUser.name }, ${ firstUser.id }, ${ firstUser.balance }")
    println("Second user: ${ secondUser.name }, ${ secondUser.id }, ${ secondUser.balance }")
}
