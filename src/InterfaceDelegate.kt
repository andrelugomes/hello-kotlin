
fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val plecostomus = Plecostomus()
    println("Color : ${plecostomus.color}")
    plecostomus.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

/*class Plecostomus: FishAction, FishColor {
    override fun eat() {
        println("eating...")
    }

    override val color: String
        get() = "gold"
}*/

class Plecostomus(fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("A lot of Algee"),
        FishColor by fishColor

/**
 * apenas uma instancia desse objeto.Singleton Pattern
 */
object GoldColor: FishColor {
    override val color = "gold"
}

object RedColor: FishColor {
    override val color = "red"
}

class PrintingFishAction(val food: String): FishAction{
    override fun eat() {
        println(food)
    }

}