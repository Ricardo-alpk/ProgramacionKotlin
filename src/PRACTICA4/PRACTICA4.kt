package PRACTICA4
/**
 * 1.- Crear un fichero “Practica4.kt” dentro del package “practicas” donde estará nuestra función main
 * que instanciará la calculadora y desde donde llamaremos a los métodos
 * 2.- Crea un fichero de clase “Calculadora.kt” dentro del package “practicas”.
 * 3.- Implementar las operaciones básicas con parámetros tipo Int (suma, resta, multiplicación y división)
 * 4.- Probar la clase leyendo 2 enteros por pantalla y llamando a las 4 funciones
 * */

fun main(){
    println("Introduze numero 1 para operar")
    val num1 = readLine()?: "0"

    val num1int = num1.toInt()

    println("ok crack ahora introduce el numero 2")
    val num2 = readLine()?: "0"

    val num2int = num2.toInt()

    val calculadora = Calculadora() //INSTANCIAMOS EL OBJETO

    println("====LOS CALCULOS====")

    val suma = calculadora.sumar(num1int,num2int)

    println("la suma es ${suma}")

    val resta = calculadora.restar(num1int,num2int)

    println("la resta es ${resta}")


    val multi = calculadora.multi(num1int,num2int)

    println("la multiplicación es ${multi}")


    val divi = calculadora.divi(num1int,num2int)

    println("la división es ${divi}")





}