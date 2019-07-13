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
     * This esta expl�cito
     */
    with(fish.name){
        println(this.capitalize())
    }

    /**
     * This esta inpl�cito
     */
    myWith(fish.name){
        println(toUpperCase())
    }

}


/**
 *  O segundo argumento � um lambda. Esse lambda extende String e n�o retorna nada.
 *
 *  como name � uma string: podemos fazer name.block()
 */
fun myWith(name: String, block: String.() -> Unit){
      name.block()
}