package tasks

fun exercise39() {
    val morseDictionary = mapOf(
        "A" to ".-", "B" to "-...", "C" to "-.-.", "D" to "-..", "E" to ".", "F" to "..-.",
        "G" to "--.", "H" to "....", "I" to "..", "J" to ".---", "K" to "-.-", "L" to ".-..",
        "M" to "--", "N" to "-.", "O" to "---", "P" to ".--.", "Q" to "--.-", "R" to ".-.",
        "S" to "...", "T" to "-", "U" to "..-", "V" to "...-", "W" to ".--", "X" to "-..-",
        "Y" to "-.--", "Z" to "--..", " " to " ", "1" to ".----", "2" to "..---", "3" to "...--",
        "4" to "....-", "5" to ".....", "6" to "-....", "7" to "--...", "8" to "---..",
        "9" to "----.", "0" to "-----",
    )
    print("Type \"to\" if you want to translate TO Morse, or \"from\" if you want to translate FROM Morse: ")
    val type = readln().lowercase()
    print("Enter a word(if you want to translate FROM Morse, divide each symbol with space): ")
    val input = readln().uppercase()
    if (type == "to") {
        for (i in input) {
            print(morseDictionary["$i"])
        }
    } else {
        for (i in input.split(" ")) {
            print(morseDictionary.filterValues { it == "$i" }.keys)
        }
    }
}