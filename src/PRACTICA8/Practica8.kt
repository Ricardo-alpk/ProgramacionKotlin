package PRACTICA8
/**
 * Práctica 8:
 * Crea un programa en Kotlin que:
 * 1.- Pida un número entero positivo n.
 * 2.- Imprima los números del 1 al n usando un bucle for.
 * 3.- Pero con estas condiciones:
 * a. Si el número es múltiplo de 3, saltarlo con continue.
 * b. Si el número llega a 20, detener el bucle con break.*/

fun main(){
    println("Introduce un numero positvo")
    try {
        var num: Int = (readLine() ?: "0").toInt()

        for (i in 1 .. num){
            if(i % 3 == 0){
                continue
            }
            if (i == 20){
                println("LLegamos al limite")
                break
            }
            println(i)
        }

    } catch (e: Exception){
        println("Error")
    }
}