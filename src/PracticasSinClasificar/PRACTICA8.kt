/*
1.- Pida un número entero positivo n.
2.- Imprima los números del 1 al n usando un bucle for.
3.- Pero con estas condiciones:
	a. Si el número es múltiplo de 3, saltarlo con continue.
	b. Si el número llega a 20, detener el bucle con break.
*/package PracticasSinClasificar

fun main(){
    println("Escribe un numero positivo")
    val n = (readln()?:"0").toInt()

    for (i in 1..n){
        if ((i % 3 == 0)){
            println("MULTIPLO DE 3")
            continue //SALTAR MULTIPLO DE 3

        }

        if (i >= 20){
            println("ACABAMOS")
            break //SE ACABA EL BUCLE
        }

        println("$i")

    }

}