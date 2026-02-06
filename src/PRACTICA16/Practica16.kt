package PRACTICA16

/**1.- Definir todo el código en el fichero “Practica16.kt”
 * a) Crea una función obtenerCoordenadas() que devuelva un Pair<Double, Double> representando una coordenada (x, y).
 * b) Desde main, usa la desestructuración para obtener x e y, e imprime un mensaje:
 * “La coordenada tiene x = ..., y = ...”.
 * c) Crea una función obtenerColorRGB() que devuelva un Triple<Int, Int, Int>, por ejemplo (r, g, b) para representar color
 * RGB.
 * e) Desde main, desestructura para obtener r, g, b, imprime:
 * "Color RGB: r=…, g=…, b=…“
 * Os ayudo con la primera (la simulamos… no es necesario leerla por pantalla)
 * fun obtenerCoordenadas(): Pair<Double, Double> {
 *  return Pair(12.5, 8.3)
 * }
 * */

fun main(){
    // a) y b) Desestructuración de Pair
    val (x, y) = obtenerCoordenadas()
    println("La coordenada tiene x = $x, y = $y")

    // c) Desestructuración de Triple
    val (r, g, b) = obtenerColorRGB()
    println("Color RGB: r=$r, g=$g, b=$b")

}

fun obtenerCoordenadas(): Pair<Double, Double> {
    // Simulamos coordenadas de ejemplo
    return Pair(12.5, 8.3)
}

fun obtenerColorRGB(): Triple<Int, Int, Int> {
    // Simulamos valores de un color RGB
    return Triple(120, 200, 150)
}
