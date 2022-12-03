package tasks

fun exercise41() {
    val natoAlphabet = mapOf(
        "A" to "Alpha", "B" to "Bravo", "C" to "Charlie", "D" to "Delta", "E" to "Echo", "F" to "Foxtrot",
        "G" to "Golf", "H" to "Hotel", "I" to "India", "J" to "Juliett", "K" to "Kilo", "L" to "Lima",
        "M" to "Mike", "N" to "November", "O" to "Oscar", "P" to "Papa", "Q" to "Quebec", "R" to "Romeo",
        "S" to "Sierra", "T" to "Tango", "U" to "Uniform", "V" to "Victor", "W" to "Whiskey", "X" to "X-ray",
        "Y" to "Yankee", "Z" to "Zulu", " " to " ",
    )

    print("Type \"to\" if you want to translate TO NATO, or \"from\" if you want to translate FROM NATO: ")
    val type = readln().lowercase()
    if (type == "to") exercise40()
    else {
        print("Enter a word: ")
        val input = readln()
        for (i in input.split(", ")) {
            print("${natoAlphabet.filterValues { it == "$i" }.keys }, ")
        }
    }
}