import models.User

fun createNewUser(): User {
    return User(1, "André Luis", "Gomes")
}

fun main(args: Array<String>) {
    val user = createNewUser()
    println("id = ${user.id}, name = ${user.name}, lastname = ${user.lastName}")
}