import kotlin.math.pow

fun main(args: Array<String>) {
    val array = Array(7){2.0.pow(it)} // aplicando um map emcada indice

    array.forEach {

        println(it)
    }
}