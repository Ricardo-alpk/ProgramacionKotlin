package PRACTICA8.ControlFlujo

fun main() {
    println("==========BREAK Y CONTINUE==========")

    for(i in 1..10) {
        if (i == 5) continue //Aca se salta el 5 y pasa directamente del 4 al 6

        if (i == 8) break //Se detiene al llegar al 8 , no imprime ni 8, ni 9, ni 10

        println(i)
    }

    /**
     * Imprimir los multiplos de 4 del 1 al 20
     */

    for (i in 1..20){
        if(i % 4 != 0){
            continue
        }
        println("Multiplo de 4: ${i}")
    }
}