/**
 * Calculate Wikipedia and Memes consumptions
 */
package tasks

fun exercise12(wikipediaMb: Int, memesMb: Int): String {
    val wikipediaConsumption = wikipediaMb * 0.10
    val memesConsumption = memesMb * 0.05

    if (memesConsumption > wikipediaConsumption) {
        return("WOW MANY MEMES \n SUCH LOL")
    } else if ((wikipediaConsumption + memesConsumption) > 100) {
        return("Too much consumption")
    }

    return("")
}
