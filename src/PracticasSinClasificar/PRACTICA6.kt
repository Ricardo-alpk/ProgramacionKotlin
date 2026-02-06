/*
.- Hacer un programa que pida peso (kg) y altura (m) de una persona,
calcule el Índice de Masa Corporal (IMC = peso / altura²) y muestre:
- "Bajo peso" si el IMC < 18.5
- "Normal" si el IMC está entre 18.5 y 24.9
- "Sobrepeso" si el IMC está entre 25 y 29.9
- "Obesidad" si el IMC >= 30
*/
package PracticasSinClasificar

fun main(){
    println("ESCRIBE TU PESO EN KILOS")

    val peso = (readln()?:"0").toInt()

    println("OK AHORA PON TU ALTURAN EN METROS")
    val altura = (readln()?:"0").toDouble()

    val imc = peso / (altura * altura)
    println("el imc es $imc")

    when{
        imc < 18.5 -> println("bajo peso")
        imc >= 18.5 && imc < 25 -> println("normal")
        imc >= 25 && imc <30 -> println("sobrepeso")
        imc > 30 -> println("obesidad")
    }


}