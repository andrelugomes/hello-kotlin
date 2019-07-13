import models.Fish

fun main(args: Array<String>) {
    val fish = Fish("peixe")


    println(fish.apply {  }) //retorna o objeto

    val fish2 = Fish(name = "Nemo").apply { name="Dory" }
    println(fish2)
}
