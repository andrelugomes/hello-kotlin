import models.Fish

/**
 * executa o bloco de código e retorna o resultado
 */
fun main(args: Array<String>) {
    val fish = Fish("peixe")

    //run(block: () -> R): R
    run {
        println(fish.name.toUpperCase())
    }

    //T.run(block: T.() -> R): R
    println(fish.run {name}) //retorna o resultado

}
