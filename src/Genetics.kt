/**
 * IN = tipo de entrada (Argumentos em métodos... Parametros)
 * OUT = tipo do retorno (Contrutores e classes... Retornos)
 *
 * Re
 *
 */
open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }

}

/*fun isSmallBuilding(building: Building<BaseBuildingMaterial>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}*/

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}

fun doSomething(building: Building<BaseBuildingMaterial>) = println("something")

interface Facade<in T : BaseBuildingMaterial> {
    fun show(baseBuildingMaterial: T)
}

fun main(args: Array<String>) {
    Building(Wood()).build()

    val brick = Building(Brick())
    isSmallBuilding(brick)
    brick.build()


    doSomething(brick) //class Building<T: BaseBuildingMaterial>(    //Sem ou out não compila. Kotlin não consegue garantir o tipo

}