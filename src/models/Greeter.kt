package models

/**
 * Não abuse na quantidade de construtores. Use apenas um e deais coisas com INIT Blocks
 *
 * se necessário usa HelperMethods
 */
class Greeter(val name: String, val age: Int) {  // primary constructor //constructor omitted

    constructor(name: String) : this(name, 18)

    init {
        println("First initializer block that prints name ${name}")
    }

    init {
        println("Second initializer block that prints age $age")
    }

    fun greet() {
        println("Hello, $name")
        println("Your are $age years old.")
    }
}

fun defauktGreeter(): Greeter {
    return Greeter("Padrão", 20)
}