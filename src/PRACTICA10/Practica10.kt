package PRACTICA10
/**Práctica 10: Calculadora con funciones con cuerpo de expresión
1.- Recuperar la calculadora de la práctica nº 5
2.- Crear dos ficheros Practica10.kt y CalculadoraCuerpoExpresion.kt
3.- Redefinir las operaciones sumar, restar, multiplicar y dividir con enteros para
expresarlas con funciones con cuerpo de expresión.
4.- Además añadir un método para saludar antes de pedir los números que acepte dos
parámetros (un nombre y un tratamiento –Doña o Don-) Por defecto el tratamiento será
Doña. En la llamada de prueba debemos usar argumentos nombrados para el nombre.
Ejemplo: calculadora.saludar(“Luisa”) => “Buenos días Doña Luisa”
 * */
fun main(){
    val calculadora = CalculadoraCuerpoExpresion()

    print("Introduzca su nombre: ")
    val usuario : String? = readLine()
    println(calculadora.saludar(nombre = usuario))

    print("Introduzca el primer entero: ")
    val a : Int? = readLine()?.toIntOrNull()

    print("Introduzca el segundo entero: ")
    val b : Int? = readLine()?.toIntOrNull()

    println("suma = ${calculadora.sumar(a, b)}")
    println("resta = ${calculadora.restar(a, b)}")
    println("multiplica = ${calculadora.multiplicar(a, b)}")
    try {
        val resultado : Double = calculadora.dividir (a, b)
        println("divide $a / $b = ${"%.2f".format(resultado)}")   // Se formatea el valor double a 2 decimales
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
