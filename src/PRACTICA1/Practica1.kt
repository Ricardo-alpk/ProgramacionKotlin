package PRACTICA1

fun main() {
    println("Introduce nombre")

    val nombre: String
    nombre = readLine()?: "0"

    println("Introduce tu edad")
    val edadInput = readLine()?: "0"
    val edad = edadInput.toInt()  // c

    val edadfut = edad + 5

    println("Hola $nombre veo que tienes $edad años, en unos 5 años tendras $edadfut ")









}