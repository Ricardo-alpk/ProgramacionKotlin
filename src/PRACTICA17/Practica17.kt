package PRACTICA17
/**
 * Práctica 17: Clases de datos
 * 1.- Crea el código en el fichero “Practica17.kt”
 * 2.- Declara una data class llamada Usuario con:
 * nombre: String
 * edad: Int
 * email: String
 * 3.- Crea una instancia de Usuario en main. Desestructura la instancia para obtener nombre y edad solo,
 * ignorando email. Imprime algo como:
 * "Usuario: Ana tiene 15 años"
 * */

fun main(){
    // Crear una instancia de Usuario
    val usuario = Usuario2("Ana", 25, "ana@example.com")

    // Desestructuración: solo nombre y edad, ignorando email
    val (nombre, edad, _) = usuario

    // Imprimir mensaje
    println("Usuario: $nombre tiene $edad años")
    println("SU GMAIL ES: ${usuario.email}")
}


data class Usuario2(val nombre: String, val edad: Int, val email: String)