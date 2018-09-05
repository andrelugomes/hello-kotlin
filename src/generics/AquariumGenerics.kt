package generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true){
    fun addChemicalCleaners() = apply { needsProcessed = false }   //call a function
}

class FisheStoreWater : WaterSupply(needsProcessed = false)

class LakeWater : WaterSupply(needsProcessed = true){
    fun filter() = apply { needsProcessed = false }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T){
     fun addWater(cleaner: Cleaner<T>) {
         if(waterSupply.needsProcessed){
             cleaner.clean(waterSupply)
         }

         println("Adding water from $waterSupply")
     }

    /**
     * isChecks : Para checar o tipo em tempo de execu��o. N�o so na compila��o
     *
     * reified : torne o parametro de Tipo Real
     *
     * inline : usado pelo kotlin para a chamada. Ou seja, o inline � chamado antes do hasWaterSupplyOfType.
     * para descobrir o tipo real do R
     *
     */
    //inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R //Retorna verdadeiro se T � R
}

/**
 *Faz mas sentido ser uma exten��o do que estar na API . n�o pe regra de neg�cio
 *
 *
 */
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

/**
 * Fun��o gen�rica
 */
fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("water is clean? ${aquarium.waterSupply.needsProcessed}")
}

interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }

}

// usando exten��o com check de Tipo real
inline fun <reified T: WaterSupply> WaterSupply.isTypeOf() = this is T

fun main(args: Array<String>) {
    val tapWaterCleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(tapWaterCleaner)
    isWaterClean(aquarium)

    println(aquarium.hasWaterSupplyOfType<TapWater>()) //true
    println(aquarium.hasWaterSupplyOfType<LakeWater>()) //false
    println(aquarium.waterSupply.isTypeOf<LakeWater>()) //false
}