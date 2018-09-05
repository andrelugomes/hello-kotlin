
class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>) {

    val book = Book("Romeon and Juliet", "William Shakespeare", 1597)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    val pair = "Key" to "Value"
    val listOfPairs = listOf("Key1" to "Value1", "Key2" to "Value2")

    println(pair)
    println(pair.toString())
    println(pair.toList())

    println(listOfPairs)
    println(listOfPairs.toMap())
    println(listOfPairs.toSet())

}