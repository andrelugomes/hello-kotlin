/**
 * É uma expressão que cria uma função (função sem nome)
 *
 *
 * Lambdas são objetos
 *
 *  { ..}()
 */
fun main(args: Array<String>) {

    {println("Eager execution Lambda!")}()

    val lamb = {println("lazy execution Lambda!")}

    lamb()//lazy

    val param = { param: Int -> println("Lambda with parameter $param")}

    param(2)

    val inference: (Int) -> Unit = { param -> println("Inference $param")} //Inferencia de tipo

    inference(34)

    myCall("andre") {
        capitalize()
    }

    //Sem o inline um Objeto é criado toda vez que o myCall é chamado
    myCall("andre", object : Function1<String, Unit>{  //Function1 é chamado toda vez
        override fun invoke(p1: String) {
            p1.capitalize()
        }
    })

    //Com o inline, nenhum objeto é criado e o corpo do lambda é chamdo diretamente
    "andre".capitalize() //?????????????????

}

// Zero de overhead
inline fun myCall(name: String, block: String.() -> Unit){
    name.block()
}