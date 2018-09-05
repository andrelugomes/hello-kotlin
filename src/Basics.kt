fun main(args: Array<String>) {
    var number = 10  //mutable
    number = number.plus(5).minus(8).times(4).div(2)
    println(number)


    val boxed: Number = 2
    boxed.toLong() //boxing


    val one = 1.toLong()  // imutable
    one.plus(2)
    println(one)


    val b: Byte = 1
    //val i: Int = b ERROR
    val i: Int = b.toInt()

    //val test: String = null  n�o pod ser nulo

    val test: String? = null // pode ser devido ao ?

    //val food: String = "yes"
    val food: String? = null

    println(food?.toUpperCase() ?: "YESSSSS")  // se food n�o for nulo, chama o toUpperCase, sen�o "YESSSS"

    val listOfNulls: List<String?>? = listOf(null, null)

    // !! vai avaliar NPE
    val result = if (listOfNulls!!.isEmpty()) false else true   // tudo retorna algo. At� o IF tem um retorno

    good(12)
    good(24)
    
}

fun good(hour: Int): String {
    when(hour) {
        in 1..12 -> return "Good morning, Kotlin"
        else -> return "Good night, Kotlin"
    }
}