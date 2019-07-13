/**
 * Funções são alocadas como Objetos na memória
 *
 *  inline é usado pra diminuir o overhead de chamadas/memória em lambdas nas funções de alta ordem
 *
 *  compilador irá alinhar a função e os lambdas na memória
 *
 *  https://android.jlelse.eu/learning-kotlin-inline-functions-18a94d3efe46
 *  https://kotlinlang.org/docs/reference/inline-functions.html#reified-type-parameters
 *
 *  https://www.baeldung.com/kotlin-inline-functions
 */
inline fun someMethod(a: Int, func: () -> Unit):Int {
    func()
    return 2*a
}


fun main(args: Array<String>) {
    var a = 2
    println(someMethod(a, {println("Just some dummy function")}))
}