package PRACTICA8

//quiere decir que se ejecfuta al menos una vez
fun main() {

    do {
        println("Capital de colombia?")
        println("a. La Paz\nb. Buenos Aires\nc. La Habana\nd. Bogotá")

        val respuesta = readLine()?: " "

    } while (respuesta != "d")
}