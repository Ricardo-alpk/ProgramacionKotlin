package PRACTICA18
/**1.- Creo un fichero “Practica18.kt” para el código.
2.- Declara una clase normal (sin data) llamada Libro con propiedades:
titulo: String
autor: String
anioPublicacion: Int
3.- Define manualmente los operadores component1(), component2(), component3() para esa clase.
4.- Crea una instancia de Libro en main, desestructura y muestra las propiedades con la
desestructuración. Muestro un mensaje similar a este:
Mensaje: “El libro X del autor Y fue publicado en el año Z”
 * */

fun main(){
    // Crear una instancia de Libro
    val libro = Libro("Cien años de soledad", "Gabriel García Márquez", 1967)

    // Desestructuración en variables
    val (titulo, autor, anio) = libro

    // Mostrar mensaje
    println("El libro $titulo del autor $autor fue publicado en el año $anio")

}

class Libro(val titulo: String, val autor: String, val anioPublicacion: Int) {

    // Definimos manualmente los componentN()
    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}