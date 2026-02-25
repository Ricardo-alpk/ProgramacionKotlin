package PRACTICA8.ControlFlujo

fun main() {
    var tiradas = 0

    while (tiradas < 3){
        println("OK, INTENTO NUMERO ${tiradas}")
        tiradas++
    }

    //Ejercicio planteado
    //Programa que pida un numero al usuario constantemente
    //y que siga hasta que se introduzca un cero

    //Ejemplo while:

    var final = (readLine()?: "0").toInt()

    while (final != 0 ){
        println("Introduce un numero")
        final = (readLine()?: "0").toInt()
    }









}