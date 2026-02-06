package PRACTICA19
/**Práctica 19: Desestructuración en colecciones de objetos (extensión de la práctica anterior)
1.- Crea un fichero llamado “Practica19.kt” para el código.
2.- Declara una clase normal (sin data) llamada Novela con las propiedades:
titulo: String
autor: String
anioPublicacion: Int
3.- Define manualmente los operadores component1(), component2() y component3() en la clase Novela.
4.- En main, crea una lista de varios libros (al menos tres).
val biblioteca = listOf( Novela(,,), Novela(,,), Novela(,,) )
5.- Recorre la lista con un bucle for, utilizando la desestructuración de objetos para obtener titulo, autor y anioPublicacion.
Utiliza for (,,,) in
6.- Para cada libro, imprime un mensaje con el formato: ”La novela X del autor Y fue publicada en el año Z”
7.- Desectructura
 * */
fun main(){
    // Crear una lista de novelas
    val biblioteca = listOf(
        Novela("Don Quijote de la Mancha", "Miguel de Cervantes", 1605),
        Novela("El Señor de los Anillos", "J.R.R. Tolkien", 1954),
        Novela("Cien años de soledad", "Gabriel García Márquez", 1967)
    )

    // Paso 5 y 6: bucle con desestructuración completa
    for ((titulo, autor, anio) in biblioteca) {
        println("La novela $titulo del autor $autor fue publicada en el año $anio")
    }

    println("-----")

    // Paso 7: forEach con lambda, ignorando el autor
    biblioteca.forEach { (titulo, _, anio) ->
        println("La novela $titulo fue publicada en el año $anio")
    }
}

class Novela(val titulo: String, val autor: String, val anioPublicacion: Int) {

    // Definimos manualmente los componentN()
    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}