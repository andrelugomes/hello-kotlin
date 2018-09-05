
fun main(args: Array<String>) {
    println(sum(1,2))
    println(inlineSum(1,2))
    printSum(2,1)
    printSumUnitOmitted(2,3)
    println(sumDefault())
    println(sumDefault(a=2))
    println(sumDefault(2, b=10))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun inlineSum(a: Int, b: Int) = a + b

/**
 * Unit
 *
 * The type with only one value: the Unit object. This type corresponds to the `void` type in Java.
 */
fun printSum(a: Int, b: Int): Unit {
    println("name of $a and $b is ${a + b}")
}

fun printSumUnitOmitted(a: Int, b: Int) {
    println("name of $a and $b is ${a + b}")
}

fun sumDefault(a: Int = 3, b: Int = 3): Int {
    return a + b
}
