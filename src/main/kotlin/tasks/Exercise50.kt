package tasks

fun exercise50() {
    val usersList = mutableListOf<Ex47BankUser>()
    val userJohn = Ex47BankUser("John")
    userJohn.id = 1
    userJohn.balance = 100
    usersList.add(userJohn)

    while(true) {
        print("Enter 'C' to create user, 'ID' to update id, 'B' to update balance. 'exit' to exit: ")
        when (readln().lowercase()) {
            "c" -> {
                print("Enter the user's name: ")
                val name = readln()
                usersList.add(Ex47BankUser(name))
                print("Enter the user's id: ")
                usersList.last().id = readln().toInt()
                print("Enter the user's balance: ")
                usersList.last().balance = readln().toInt()
            }

            "id" -> {
                print("Enter the user's id: ")
                val id = readln().toInt()
                print("Enter the new id: ")
                val newId = readln().toInt()
                usersList.forEach {
                    if (it.id == id)
                        it.id = newId
                }
            }

            "b" -> {
                print("Enter the user's id: ")
                val id = readln().toInt()
                print("Enter the new balance: ")
                val newBalance = readln().toInt()
                usersList.forEach {
                    if (it.id == id)
                        if (newBalance == 0)
                            usersList.remove(it)
                        else
                            it.balance = newBalance
                }
            }
            "exit" -> break
        }
    }

    usersList.forEach {
        println("User: ${ it.name }, ${ it.id }, ${ it.balance }")
    }
}