package models


class Client(name: String) : Person(name) {
    override fun funnyName(): String{
        return name
    }
}