package PRACTICA6

fun main() {
    var dato1 = 15 //variableMutable

    val dato2 = 24 // variableINmutable

    dato1 = 3


    println("BUCLES / EJERCICIO 6")

    /*Objetivo: Pedir peso y altura, calcular IMC y clasificarlo.
    Fórmula: $IMC = peso / altura^2$Rangos: < 18.5 (Bajo), 18.5-24.9 (Normal), 25-29.9 (Sobrepeso), >=30 (Obesidad).*/

    println("Introduce tu peso en KG")

    val peso : Float = (readLine()?: "0").toFloat()

    println("Introduce tu altura en CM")

    val altura: Float = (readLine()?: "0").toFloat()

    val imc = peso / (altura * altura)

    println("TU IMC ES: ${imc}")

    when{
        imc < 18.5 -> println("BAJO PESO")
        imc >= 18.5 && imc < 25 -> println("NORMAL")
        imc >= 25 && imc < 30 -> println("SOBRE PESO")
        imc >= 30 -> println("BAJO PESO")
    }







}