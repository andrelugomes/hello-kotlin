/**
 * Func��es que recebem outras fun��es como argumentos
 */
fun main(args: Array<String>) {

    val double: (Int) -> Int = { x -> 2 * x}

    println(applyNumberToOperation(2, double)) //val

    println(applyNumberToOperation(3, ::triple)) //fun��o nomeada. N�o � um lambda

    println(applyNumberToOperation(4, { x -> 2 * x})) //Lambda

    println(applyNumberToOperation(5) {
        x -> 2 * x
    }) //Lambda SINTAXE DO ULTIMO PARAMETRO. Pode ir fora dos () //Filter .. Repeate

}

/**
 * Recebe um parametro, uma fun��o.
 * Devolve um Int
 */
fun applyNumberToOperation(number: Int, operation: (Int) -> Int): Int{
    return operation(number)
}

fun triple(x: Int) =x * 3

