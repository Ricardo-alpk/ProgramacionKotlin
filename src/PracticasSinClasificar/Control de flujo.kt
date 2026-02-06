package PracticasSinClasificar

fun main() {
    val input = 'y'

    when (input) {
        'y' -> print("CONTINUANDO...")
        'n' -> print("CERRANDO...")
        else -> print("Entrada invalida")
    }
    /*
        val formResponse: Any = 12

        when (formResponse){
            is Int -> println("Respuesta Entera")
            is String -> println("Respuesta String")
        }*/

    println("")

    val formResponse: Any = "12"

    when (formResponse) {
        is Int -> {
            val times = formResponse * 100
            println("Respuesta Entera:$times")
        }

        is String -> {
            val times = formResponse.toInt() * 100
            println("Respuesta String:$times")
        }
    }

    val a = -5

    when {
        a > 0 -> println("ES POSITIVO")
        a == 0 -> println("ES CERO")
        else -> println("es negativo")
    }

    val playerLucky = 0.2
    val bonus = 0.3

    when (val damage: Double = playerLucky + bonus) {
        in 0.0..0.3 -> print("Daño recibido:${damage * 10}")
        in 0.3..0.6 -> print("Daño recibido:${damage * 20}")
        in 0.6..1.0 -> print("Daño recibido:${damage * 30}")
    }


    println("ESCRIBE LA NOTA QUE OBTUVISTE")
    val texto = readln()?: "0".toInt()

    val marknumber = texto

    val markText = when (marknumber) {
        1 -> "Insuficiente"
        2 -> "Deficiente"
        3 -> "Aceptable, FINE"
        4 -> "Sobresaliente, MI KING"
        5 -> "Excelente, POR FIN"
        else -> "No permitido......."
    }

    println("LA CALIFICACIÓN ES: $markText")


}