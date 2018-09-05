
/*fun String.hasSpaces(): Boolean {
    val found:Char? = this.find { it == ' ' }
    return found != null
}*/

fun String.hasSpaces() = find { it == ' ' } != null

class AquariumPlant(val color: String, private val size: Int)


fun AquariumPlant.isGreen() = color == "green"

/**
 * Extention Functions resolvem de forma estatica em tempo de compilação
 */
fun main(args: Array<String>) {
    println("André Luis Gomes".hasSpaces())

    val aquariumPlant = AquariumPlant("green", 23)

    println(aquariumPlant.isGreen())
}
