import models.Greeter

/**
 * Smart Cast
 */
fun main(args: Array<String>) {

    val greeter = Greeter("André", 33)
    val greeter2 = Greeter("Luis")
    print(greeter)
    print(greeter2)

    println(whatIsMyName(greeter))
    println(whatIsMyAge(greeter))

    println(whatIsMyName(greeter2))
    println(whatIsMyAge(greeter2))
    
}

fun print(obj: Any) {

    //if (obj is Greeter)
    //    obj.greet() // no cast to String is needed

    (obj as? Greeter)?.greet() 
}

fun whatIsMyName(obj: Any): String? {
    if (obj is Greeter)
        return obj.name
    return null
}

fun whatIsMyAge(obj: Any): Int {
    //return if (obj is Greeter) obj.age else 0
    return (obj as? Greeter)?.age ?: 0
}