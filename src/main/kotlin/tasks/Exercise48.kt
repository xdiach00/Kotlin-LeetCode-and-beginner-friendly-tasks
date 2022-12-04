package tasks

fun exercise48() {
    val usersList = mutableListOf<Ex47BankUser>()
    while (true) {
        print("Enter the user's name('exit' to stop): ")
        val name = readln()
        if (name == "exit") break
        usersList.add(Ex47BankUser(name))
        print("Enter the user's id: ")
        usersList.last().id = readln().toInt()
        print("Enter the user's balance: ")
        usersList.last().balance = readln().toInt()
    }

    usersList.forEach {
        if (it.balance == 0)
                usersList.remove(it)
    }

    usersList.forEach {
        println("User: ${ it.name }, ${ it.id }, ${ it.balance }")
    }
}