package tasks

class CompanyUser(
    val name: String,
    private val password: String,
    val userSalary: Int,
    val email: String,
) {
    init {
        println("User $name created")
    }

}

fun exercise45() {
    val usersList = mutableListOf<CompanyUser>()
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

        if (ex45_checkIfExists(name, usersList) || ex45_checkIfExists(email, usersList)) {
            println("User with this name or email already exists!")
        } else {
            usersList.add(CompanyUser(name, password, salary, email))
        }
    }

    usersList.forEach {
        println("User name: ${it.name}, salary: ${it.userSalary}, email: ${it.email}")
    }
}

fun ex45_checkIfExists(param: String, userList: MutableList<CompanyUser>): Boolean {
    for (i in userList) {
        if (i.name == param || i.email == param) return true
    }
    return false
}