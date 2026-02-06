/*Práctica 2: El Analizador de Posiciones
Crea un programa (fichero “practica2.kt”) que:
 Pida una cadena de texto por pantalla.
 Pida un número entero que represente una posición dentro de esa cadena.
 Muestre por pantalla:
El carácter correspondiente a esa posición.
El carácter anterior al de esa posición (si existe).
El carácter siguiente al de esa posición (si existe).
 Maneje correctamente los posibles errores (por ejemplo, si la posición está fuera de los límites de la cadena).*/

package PRACTICA2

fun main() {

    println("INGRESA UNA CADENA DE TEXTO");

    val text: String = readLine() ?: " "

    println("AHORA INGRESA UN NUMERO INT");

    val num = readLine() ?: "0"

    val posi: Int = (num.toInt() - 1)
    val posant: Char = text[posi - 1]
    val pospost: Char = text[posi + 1]

    val cadenasize = text.length


    if (posi >= cadenasize || posi < 0) {
        println("Valor $posi fuera de los rangos")
        println("La cadena solo tiene ${cadenasize} valores")

    } else {
        println("OK, EL CARACTER CORRESPONDIENTE A ESE NUM DE POSICIÓN ES:" + text[posi])
        if (posant == null) {
            println("NO EXISTE UN CARACTER EN POSICIÓN ANTERIOR")
        } else {
            println("EL CARACTER ANTERIOR ES ESTE $posant")
            if (pospost == null) {
                println("NO EXISTE UNC ARACTER POSTERIOR")
            } else {
                println("EL CARACTER POSTERIOR ES $pospost")
            }
        }

    }


}













