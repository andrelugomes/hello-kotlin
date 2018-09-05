import models.aquarium.Aquarium
import models.aquarium.FishAction
import models.aquarium.Plecostomus
import models.aquarium.Shark

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {

    val aquarium = Aquarium()
    val small = Aquarium(width = 15, heigth = 30, lenght = 20)
    val myAquarium = Aquarium(numberOfFishes = 100)

    println("Volume = ${aquarium.volume}")
    println("Volume = ${small.volume}")
}

fun makeFish(){
    val shark = Shark()
    val plecos = Plecostomus()

    println("Shark: ${shark.color} \n Plecostomus: ${plecos.color}")

    shark.eat()
    plecos.eat()
}

fun feedFish(fish: FishAction){
    fish.eat()
}
