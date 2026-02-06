package PRACTICA5
/**
 * 1.- Crear un fichero “Practica5.kt” dentro del package “practicas” donde estará nuestra función main
 * que instanciará la calculadora Nulable y desde donde llamaremos a los métodos
 * 2.- Crear un fichero de clase “CalculadoraNullable.kt” dentro del package “practicas”.
 * 3.- Implementar las operaciones básicas con parámetros tipo Int (suma, resta, multiplicación y división)
 * 4.- Probar la clase leyendo 2 enteros por pantalla y llamando a las 4 funciones
 * */
fun main(){
    //Aca vamos a instanciar la calculadora nullable
    println("Introduze numero 1 para operar")
    val num1int = readLine()?.toIntOrNull()


    println("ok crack ahora introduce el numero 2")
    val num2int = readLine()?.toIntOrNull()


    val calculadora = CalculadoraNullable()

    println("suma = ${calculadora.sumar(num1int, num2int)}")
    println("resta = ${calculadora.restar(num1int, num2int)}")
    println("multiplica = ${calculadora.multi(num1int, num2int)}")
    try {
        val resultado : Double = calculadora.divi (num1int,num2int)
        println("divide $num1int / $num2int = ${"%.2f".format(resultado)}")   // Se formatea el valor double a 2 decimales
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

}