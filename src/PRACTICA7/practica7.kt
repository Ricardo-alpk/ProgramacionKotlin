package PRACTICA7

import java.io.IOException

/**
 * Hacer un programa que pida por teclado cuatro notas (con decimales) de un alumno.
 * Calcular el promedio (Utilizar WHEN con condicionales para establecer un valor)
 * Si el promedio es >= 7, mostrar “Notable".
 * Si el promedio es >= 5 y < 7, mostrar “Aprobado".
 * Si el promedio es < 5, preguntar al alumno si se presentó a recuperación (S/N).
 * Si respondió "S", mostrar "En recuperación".
 * Si respondió "N", mostrar "Suspenso".
 */
fun main(){
    try {
        println("escribe 4 notas double para un alumno")

        val notas = DoubleArray(4)

        for (i in notas.indices){
            println("ESCRIBE UNA NOTA DECIMAL")
            var nota = readLine()?.toDoubleOrNull()

            notas[i] = nota!!
        }

        //calcular promedio de notas
        var suman = 0.0

        for (nota2 in  notas){
            suman += nota2
        }

        val promed = (suman / notas.size)

        println("EL PROMEDIO ES ${promed}")

        when {
            promed >= 7 ->{
                println("NOTABLE ")
            }

            (promed >=5 && promed < 7 )-> {
            println("APROBADO")
            }

            promed < 5 -> {
                println("PARA EL ALUMNO? \n \n" +
                        "Te vas a presentar a recuperación?")

                val res = readLine()?: "0"

                when{
                    res == "si" ->{
                        println("EN RECUPERACIÓN")
                    }

                    res == "no"->{
                        println("SUSPENSO")
                    }
                }
            }

        }


    } catch (e : IOException){
        println("ERROR " + e)
    } catch (e : NullPointerException){
        println("ERROR EN LA ENTRADA "  + e)
    }
}