package PRACTICA14
/**
 * 1.- Crea una clase “CalculadoraBase” que sea abierta open para poder hacerla heredable.
 * 2.- Recibirá en el constructor dos argumentos de tipo Double
 * open class CalculadoraBase(val a: Double, val b: Double)
 * 3.- Implementar los métodos sumar, restar, multiplicar y dividir.
 * fun sumar () = a + b
 * 4.- Declarar una clase “CalculadoraCientifica“ que herede de CalculadoraBase
 * 5.- Añadir las funcionalidades de calcular el cuadrado y la raíz cuadrada del primer valor a
 * import kotlin.math.pow
 * import kotlin.math.sqrt
 * 6.- Crear el fichero Practica14.kt para probar CalculadoraBase y CalculadoraCientifica
 *
 * ********
 *
 * Esta es la función para probar el uso de ambas clases:
 * fun main() {
 * println("Prueba de la clase CalculadoraBase")
 * val calculadora1 = CalculadoraBase(10.0, 2.0)
 * println("Resultado suma:" + calculadora1.sumar())
 *
 *
 * println("Prueba de la clase CalculadoraCientifica (suma de dos números y el cuadrado y la raíz del primero)")
 * val calculadoraCientifica1 = CalculadoraCientifica(10.0, 2.0)
 * println("Resultado suma científica:" + calculadoraCientifica1.sumar())
 * println("Resultado cuadrado:" + calculadoraCientifica1.cuadrado())
 * println("Resultado raíz:" + calculadoraCientifica1.raizCuadrada())
 * }
 *
 */


fun main(){
    println("Prueba de la clase CalculadoraBase")
    val calculadora1 = CalculadoraBase(10.0, 2.0)
    println("Resultado suma: " + calculadora1.sumar())

    println("Prueba de la clase CalculadoraCientifica (suma de dos números y el cuadrado y la raíz del primero)")
    val calculadoraCientifica1 = CalculadoraCientifica(10.0, 2.0)
    println("Resultado suma científica: " + calculadoraCientifica1.sumar())
    println("Resultado cuadrado: " + calculadoraCientifica1.cuadrado())
    println("Resultado raíz: " + calculadoraCientifica1.raizCuadrada())
}
