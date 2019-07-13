import models.Fish

fun main(args: Array<String>) {
    val fish = Fish("peixe")

    /**
     * High Order FUnction
     *
     *
     * with(receiver: T, block: T.() -> R): R
     */
    with(fish){
        println(this.name)
    }

    /**
     * This esta explícito
     */
    with(fish.name){
        println(this.capitalize())
    }

    /**
     * This esta inplícito
     */
    myWith(fish.name){
        println(toUpperCase())
    }

}


/**
 *  O segundo argumento é um lambda. Esse lambda extende String e não retorna nada.
 *
 *  como name é uma string: podemos fazer name.block()
 */
fun myWith(name: String, block: String.() -> Unit){
      name.block()
}