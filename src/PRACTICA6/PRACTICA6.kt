package PRACTICA6
/**
 * 1.- Crear un fichero “Practica6.kt” dentro del package “practicas”
 * 2.- Hacer un programa que pida peso (kg) y altura (m) de una persona, calcule el Índice de Masa
 * Corporal (IMC = peso / altura²) y muestre:
 * - "Bajo peso" si el IMC < 18.5
 * - "Normal" si el IMC está entre 18.5 y 24.9
 * - "Sobrepeso" si el IMC está entre 25 y 29.9
 * - "Obesidad" si el IMC >= 30
 */
fun main(){
    println("escribe tu peso")

    var peso = readLine()?.toDoubleOrNull() ?: 0.0

    println("ok ahora tu altura")

    var altura = readLine()?.toDoubleOrNull() ?: 0.0

    //calcular imc
    val imc  = (peso / (altura *2))

    when(imc){
        in (0.0.. 18.0) ->{
            println("BAJO PESO")
        }

        in (18.5..24.9) ->{
            println("normal")
        }

         in (25.0..29.9) ->{
            println("sobrepeso")
        }

        in (30.0 ..Double.MAX_VALUE) -> {
        println("OBESIDAD")
        }
    }




}