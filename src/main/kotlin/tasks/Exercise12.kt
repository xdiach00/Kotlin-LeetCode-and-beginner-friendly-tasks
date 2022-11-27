/**
 * Calculate Wikipedia and Memes consumptions
 */
package tasks

fun exercise12(wikipediaMb: Int? = null, memesMb: Int? = null): String {
    val wikipediaMbs = wikipediaMb ?: run {
        print("Enter the amount of MBs you have spent on Wikipedia: ")
        readln().toInt()
    }
    val memesMbs = memesMb ?: run {
        print("Enter the amount of MBs you have spent on Memes: ")
        readln().toInt()
    }

    val wikipediaConsumption = wikipediaMbs * 0.10
    val memesConsumption = memesMbs * 0.05

    if (memesConsumption > wikipediaConsumption) {
        return("WOW MANY MEMES \n SUCH LOL")
    } else if ((wikipediaConsumption + memesConsumption) > 100) {
        return("Too much consumption")
    }

    return("")
}
