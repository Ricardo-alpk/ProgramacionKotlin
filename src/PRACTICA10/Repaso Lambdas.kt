package PRACTICA10

fun main(){
    println("==========REPASO LAMBDAS=============")

    //las funciones lambda son funciones anonimas

    val miLambda = {x: Int -> x*2}

    val numeros = listOf(1, 2, 3, 4)
    val dobles = numeros.map { it * 2 }  // ← esto es una lambda
    println(dobles) // [2, 4, 6, 8]
}