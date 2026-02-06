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
    println("Ingresa un numero ENTERO")

    //REPASO : VAR: puede cambiao   VAL: Es constante

    var num = readLine()?.toInt()?: 0

    for (i in 1 .. num){
        if(i % 3 == 0){
            continue // con esto salta los multiplos de 3
        }

        if(i == 20){
            println("ok llego al 20 , es el fin del bucle")
            break
        }

        println("numero $i")
    }

}