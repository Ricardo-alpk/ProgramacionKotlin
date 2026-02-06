package PRACTICA8

import javax.crypto.spec.PSource

fun main(){
    println("============bucle while=============")

    //se ejecuta siempre que la condición sea verdadera

    var i = 2;

    while ( i == 1){
        println("ES UNO BRO!!!!!!!!!!!") // SE REPITIRA SIEMPRE si la condición es verdadera
    }

    //EJEMPLO

    var sum = 0

    var chill = 1

    while (chill <= 25 ){
        sum += sum++

    }

    println("suma vale $sum ")


    //tambien se puede escribir ocn lambdas

    while(chill <= 25) sum += i++



}