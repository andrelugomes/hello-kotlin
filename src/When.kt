fun main(args: Array<String>) {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
    cases(30)


    println("How do you feel? happy, sunny or sad")
    println(whatShouldIDoToday(readLine()!!))
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Oneeeeee")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

fun cases(number: Int) {
    when (number) {
        1 -> println("One")
        in 2..40 -> println("range...")
        else -> println("Unknown")
    }
}

class MyClass() {
}

fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}




