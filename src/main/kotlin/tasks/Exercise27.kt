package tasks

class User(
    val email: String,
    private val pass: String,
) {
    var tries = 0
    var loggedIn = false

    init {
        println("User initialized")
    }

    fun register() {
        println("The user $email has been registered")
    }

    fun logIn(input: String) {
        if (input == pass) {
            println("The user $email is logged in")
            loggedIn = true
        } else {
            authError()
        }
    }

    private fun authError() {
        tries++
        if (tries == 3)
            print("WARNING! You are a bad hacker! Try something better than bruteforce!")
        else
            println("Wrong email or password! Try again! You have ${3 - tries} tries more!")
    }
}

fun exercise27() {
    val email = run {
        print("Please enter your email: ")
        readln()
    }
    val password = run {
        print("Please enter your password: ")
        readln()
    }

    var newUser = User(email, password)
    newUser.register()

    for (i in 1..3) {
        print("Please input a password for ${newUser.email}: ")
        val input = readln()

        newUser.logIn(input)

        if (newUser.loggedIn) break
    }
}