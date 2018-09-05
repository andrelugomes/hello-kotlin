fun main(args: Array<String>) {
    val decorations = listOf("rock", "sand", "castle", "plants", "fish")
    //eager as defaul
    val eager = decorations.filter { it[0] == 'p' } // '' charcter "" string
    println(eager)

    val lazy = decorations.asSequence().filter { it[0] == 'c' }
    println(lazy)
    println(lazy.toList())

    val lazyMap = decorations.asSequence().map {
        println("map : $it") // don't print
    }

    println(lazyMap.toList()) // now it prints

}