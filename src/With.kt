
data class Fish(var name: String)

fun main(args: Array<String>) {
    val fish = Fish("peixe")

    /**
     * High Order FUnction
     */
    with(fish){
        println(fish.name)
    }

    /**
     * This esta inplícito
     */
    with(fish.name){
        this.capitalize()
    }

    myWith(fish.name){
        println(capitalize())
    }

    println(fish.run {name}) //retorna o resultado
    println(fish.apply {  }) //retorna o objeto

    val fish2 = Fish(name = "Nemo").apply { name="Dory" }
    println(fish2)

    println(fish.let { it.name.capitalize() } //retorna uma cópia do objeto
            .let { it + "fish" }
            .let { it.length }
            .let { it + 10 })
}


/**
 *  O segundo argumento é um lambda. Esse lambda extende String e não retorna nada.
 *
 *  como name é uma string: podemos fazer name.block()
 */
fun myWith(name: String, block:String.() -> Unit){

      name.block()
}