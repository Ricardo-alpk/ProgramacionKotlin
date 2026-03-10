package PRACTICA8.ControlFlujo

import java.sql.SQLOutput

fun main() {
    //Ejercicio planteado
    //Programa que pida un numero al usuario constantemente
    //y que siga hasta que se introduzca un cero

    //Ejemplo while:

    println("INTRODUCE UN NUMERO")
    try {


        var numStop: Int = (readLine() ?: "0").toInt()

        while (numStop != 0) {
            println("INCORRECTO PRUEBA OTRA VEZ")
            numStop = (readLine() ?: "0").toInt()

        }

        //ejercicio do-while en kotlin

        println("==========EJERCICIO VERSIÓN DO-WHILE==========")

        println("Lets Go, introduce un numero")
        var numStop2: Int = (readLine() ?: "0").toInt()

        do {
            println("INCORRECTO, VUELVE A INTENTAR")
            numStop2 = (readLine() ?: "0").toInt()
        } while (numStop2 != 0)
    } catch ( e: NumberFormatException ){
        println("DEBES INTRODUCIR UNICAMENTE NUMEROS ENTEROS")
    }







}