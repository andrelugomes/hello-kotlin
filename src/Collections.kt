
import java.util.*
import java.util.stream.Collectors


/**
 * http://kotlinlang.org/docs/reference/collections.html
 */
fun main(args: Array<String>) {
    //List
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyList: List<Int> = numbers

    val numbers2  = mutableListOf(1, 2, 3,4,5,6,7,8,9,10)

    var sublist = numbers2.subList(5, numbers2.size)

    sublist.sum()
    
    println("Last = ${readOnlyList.last()} and First = ${readOnlyList.first()}")

    println(numbers)        // prints "[1, 2, 3]"
    numbers.add(4)
    println(numbers)        // prints "[1, 2, 3, 4]"
    println(readOnlyList)   // prints "[1, 2, 3, 4]"
    numbers.clear()
    println(numbers)        // prints "[]"
    println(readOnlyList)   // prints "[]"

    val arrayListOf = arrayListOf("andre", "luis")
    arrayListOf.forEach { a -> println(a) }
    arrayListOf.forEach { println(it) }// single parameter

    //Set
    val letters = mutableSetOf("a", "b", "c")
    println(letters)
    letters.add("d")
    println(letters)

    val imutableLetters = setOf("a", "b", "b")
    println(imutableLetters)
    //imutableLetters.add("d")

    val toCollection = imutableLetters.map { l -> l.toUpperCase() }.toCollection(ArrayList())  //Kotlin
    toCollection.forEach { c -> println(c) }

    println("Filter and first ${toCollection.filter { c -> c.equals("B") }.first()}")

    val collect = imutableLetters.stream().map { il -> il.toUpperCase() }.collect(Collectors.toList()) //Java
    collect.forEach { println(it) }

    val hashSetOf = hashSetOf("a", "b", "c", "c")

    val map = mapOf(1 to 2, 2 to 1, "q" to 3)
    val pairs = mapOf(Pair("a", 1), Pair("b", 2))

    println(map.get(1)) // 2
    println(map.get("q")) // 3


    pairs["a"]  //1

    pairs.keys.forEach { k -> println(k) }


    val numbers3 = listOf<Int>(1,2,3,4,5,6,7,8,9,0)

    print(numbers3.divisibleBy {
        it.rem(3)
    })

    println(numbers3.byThree())

}

fun List<Int>.byThree(): List<Int> {
      return this.filter {it.rem(3) == 0}
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}
