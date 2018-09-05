/**
 *  Single Abstract Method   : Uma interface com apenas um m�todo: Runnable e Callable
 */
fun main(args: Array<String>) {

    var runnable = Runnable { println("running") }

    /*var runnable = object : Runnable{
       override fun run() {
           println("running")
       }
    }*/

    JavaRun.runNow(runnable)

    JavaRun.runNow {  // Isso pois o SAM � o ultimo parametro dentre os argumentos
        println("running...")
    }
}

/*interface Runnable {
    fun run()
}*/

interface Callable<out T> {
    fun call(): T
}