
/**
 * For
 */
fun main(args: Array<String>) {

    val x = 1
    val y = 11

    if (x in 1..y - 1)// contains in range
        println("contains in range...")

    for (i in 1..10) //ranges
        println(" index ${i} ")


    val array = arrayListOf<String>()
    array.add("A")
    array.add("B")
    array.add("C")

    if (5 !in 0..array.size - 1)
        println("array has only ${array.size} elements. x = $x")

    for (a in array){
        println(a)
    }

    if ("a".toUpperCase() in array) // collection.contains(obj) is called
        println("Yes: array contains A")

    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map["two"] = 2

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }

    for (x in 1..10 step 2) {  //crescente
        println(x)
    }

    println()
    for (x in 9 downTo 0 step 3) { //decrescente
        println(x)
    }
    println()

    for (i in 1 until 100) { // de 1 a 99
        println(i)
    }
}

