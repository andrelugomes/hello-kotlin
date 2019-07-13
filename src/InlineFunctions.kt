/**
 * Fun��es s�o alocadas como Objetos na mem�ria
 *
 *  inline � usado pra diminuir o overhead de chamadas/mem�ria em lambdas nas fun��es de alta ordem
 *
 *  compilador ir� alinhar a fun��o e os lambdas na mem�ria
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