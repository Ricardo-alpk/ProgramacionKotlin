package PRACTICA6

fun main(){

    println("===========WHEN==========")

    val input = 'y'
     when (input){
         'y' -> println("CONTINUANDO.....")
         'n' -> println("CERRANDO........")

         else ->{
             println("ENTRAD INVALIDA")
         }
     }

    println("==========multiples valores en una misma condición=================")

    val input2 = 3
    when (input2) {
        1, 2, 3 -> println("Turno nocturno")
        4, 5, 6 -> println("Turno diurno")
    }

    println("===========expresiones ocmo cindiciones========")

    when (input2) {
        Char.MAX_VALUE.toInt() -> println("Límite superior")
        Char.MIN_VALUE.toInt() -> println("Límite inferior")
        else -> println("Fuera de rango")
    }

    println("===========rangos=============")

    when (input2) {
        in 1..49 -> println("Está entre 1 y 49")
        in 50..99 -> println("Está entre 50 y 99")
        else -> println("Fuera de los rangos")
    }

    /*>
    println("============comprobar tipos is==============")

    val formResponse: Any = "12"

    when (formResponse) {
        is Int -> {
            val times = formResponse * 100
            println("Respuesta entera: $times")
        }
        is String -> {
            val times = formResponse.toInt() * 100
            println("Respuesta string: $times")
        }
    }
    */

    println("=======when sin argumento==========")
    val a = -5

    when {
        a > 0 -> println("Es positivo")
        a == 0 -> println("Es cero")
        else -> println("Es negativo")
    }

    println("=============DECLARAR VARIABLE DENTRO DEL WHEN============")


    /*
    when (val damage = playerLucky + bonus) {
        in 0.0..0.3 -> println("Daño: ${damage * 10}")
        in 0.3..0.6 -> println("Daño: ${damage * 20}")
        in 0.6..1.0 -> println("Daño: ${damage * 30}")
    }
    */
    println("=========when como expresión==========")

    val mark = 4

    val texto = when (mark) {
        1 -> "Insuficiente"
        2 -> "Deficiente"
        3 -> "Aceptable"
        4 -> "Sobresaliente"
        5 -> "Excelente"
        else -> "No permitido"
    }

    println("La calificación es: $texto")

















    val formResponse: Any = "12"

    when (formResponse) {
        is Int -> {
            val times = formResponse * 100
            println("Respuesta entera: $times")
        }
        is String -> {
            val times = formResponse.toInt() * 100
            println("Respuesta string: $times")
        }
    }

}