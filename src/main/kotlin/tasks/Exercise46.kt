package tasks

data class Ex46User(
    val name: String,
    private val password: String,
    val userSalary: Int,
    val email: String,
) {


}

fun exercise46() {
    val usersList = mutableListOf<Ex46User>()
    while (true) {
        print("Enter user name('exit' to stop): ")
        val name = readln()
        if (name == "exit") break
        print("Enter user password: ")
        val password = readln()
        print("Enter user salary: ")
        val salary = readln().toInt()
        print("Enter user email: ")
        val email = readln()

        if (ex46CheckIfExists(name, usersList) || ex46CheckIfExists(email, usersList)) {
            println("User with this name or email already exists!")
        } else {
            usersList.add(Ex46User(name, password, salary, email))
        }
    }
    println("Users database:")
    usersList.forEach {
        println("User name: ${it.name}, salary: ${it.userSalary}, email: ${it.email}")
    }

    while (true) {
        print("Enter username or email to delete ('exit' to stop): ")
        val nameOrEmail = readln()
        if (nameOrEmail == "exit") break
        if (ex46CheckIfExists(nameOrEmail, usersList)) {
            usersList.removeIf { it.name == nameOrEmail || it.email == nameOrEmail }
        } else {
            println("User with this name or email doesn't exist!")
        }
    }
    println("New users database:")
    usersList.forEach {
        println("User name: ${it.name}, salary: ${it.userSalary}, email: ${it.email}")
    }
}

fun ex46CheckIfExists(param: String, userList: MutableList<Ex46User>): Boolean {
    for (i in userList) {
        if (i.name == param || i.email == param) return true
    }
    return false
}
