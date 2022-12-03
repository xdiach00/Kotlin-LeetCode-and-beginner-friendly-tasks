package tasks

fun exercise42() {
    val users = mutableMapOf<String, Any>()
    print("Enter username: ")
    val username = readln()
    print("Enter password: ")
    val password = readln()
    print("Has the user photo? (y/n): ")
    val hasPhoto = readln().lowercase() == "y"
    print("Enter user's email: ")
    val email = readln()

    users[username] = mapOf(
        "password" to password,
        "hasPhoto" to hasPhoto,
        "email" to email,
    )

    print(users)
}
