import models.User


/**
 * destructure an object into a number of variables
 *
 * http://kotlinlang.org/docs/reference/multi-declarations.html#multi-declarations
 */
fun main(args: Array<String>) {
    val user = User(1, "André", "Gomes")

    val (id, name, lastName) = user //Destructing
    println("id = $id, name = $name, lastname = $lastName ")

    println("id = ${user.component1()}, name = ${user.component2()}")
}