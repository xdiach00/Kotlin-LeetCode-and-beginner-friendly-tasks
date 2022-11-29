package tasks

fun exercise25() {
    var head = 0.0
    var tails = 0.0
    var headPercentage = 0.0
    var tailsPercentage = 0.0

    while (true) {
        print("Input tails/head or stop: ")
        val input = readln().lowercase()
        if (input == "head") head++
        else if (input == "tails") tails++
        else if (input == "stop") break
        else return
    }

    headPercentage = head / (head + tails) * 100.0
    tailsPercentage = 100 - headPercentage

    println("Head won ${ head.toInt() } times and tails won ${ tails.toInt() } times")
    println("$headPercentage% Head, $tailsPercentage% Tails")
}