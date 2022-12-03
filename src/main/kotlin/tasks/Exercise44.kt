package tasks

fun exercise44() {
    val users = mutableMapOf<String, Any>()
    var password: String

    print("Enter username: ")
    val username = readln()
    print("Enter password: ")
    while (true) {
        password = readln()
        if (password.length < 6 || password.length > 12) {
            print("Password must be at least 6 characters long! Try again: ")
        } else {
            break
        }
    }
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