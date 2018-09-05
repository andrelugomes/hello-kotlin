package models


open class Person(val name: String) {   //final by default. Open allow   Inheritance

    open fun funnyName(): String {
        return "Funny $name"
    }
}