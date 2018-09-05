package models.aquarium

import kotlin.math.PI


open class Aquarium(var width: Int = 20, var heigth: Int = 40, var lenght: Int = 100) {

    open var volume: Int
        get() =  width * heigth * lenght / 1000  // override default get
        set(value) {} //Override default SET

    /*fun volume(): Int {
        return width * heigth * lenght / 1000
    }*/

    open var water = volume * 0.9

    constructor(numberOfFishes: Int) : this(){
        val water:Int = numberOfFishes * 2000
        val tank: Double = water + water * 0.1
        heigth = (tank / (lenght * width)).toInt()

    }
}

class TowerTank() : Aquarium() {

    override var water = volume * 0.8

    override var volume:Int
        get() = (width * heigth * lenght / 1000 * PI).toInt()
        set(value){
            heigth = (value * 1000)/(width * lenght)
        }
}