import models.Fish

fun main(args: Array<String>) {
    val fish = Fish("peixe")

    println(fish.let { it.name.capitalize() } //retorna uma c�pia do objeto
            .let { it + "fish" }
            .let { it.length }
            .let { it + 10 })
}

