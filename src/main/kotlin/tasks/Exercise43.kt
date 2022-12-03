package tasks

fun exercise43() {
    val users = mutableMapOf<String, Any>()

    users["johnsilver"] = mapOf(
        "password" to "123456",
        "hasPhoto" to true,
        "email" to "1234@gmail.com",
    )

    while (true) {
        print("Enter username: ")
        val username = readln()
        print("Enter password: ")
        val password = readln()
        print("Has the user photo? (y/n): ")
        val hasPhoto = readln().lowercase() == "y"
        print("Enter user's email: ")
        val email = readln()

        if (users.containsKey(username)) {
            println("This username is already taken! Try again.")
        } else {
            users[username] = mapOf(
                "password" to password,
                "hasPhoto" to hasPhoto,
                "email" to email,
            )

            print(users)
            break
        }
    }
}