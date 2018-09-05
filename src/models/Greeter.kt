package models

/**
 * N�o abuse na quantidade de construtores. Use apenas um e deais coisas com INIT Blocks
 *
 * se necess�rio usa HelperMethods
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
    return Greeter("Padr�o", 20)
}