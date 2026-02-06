/*
Práctica 4: Calculadora
1.- Crear un fichero “Practica4.kt” dentro del package “practicas” donde estará nuestra función main que instanciará la calculadora y desde donde llamaremos a los métodos
2.- Crea un fichero de clase “Calculadora.kt” dentro del package “practicas”.
3.- Implementar las operaciones básicas con parámetros tipo Int (suma, resta, multiplicación y división)
4.- Probar la clase leyendo 2 enteros por pantalla y llamando a las 4 funciones
* */package PracticasSinClasificar

fun main(){
    fun main() {
        print("Introduzca el primer entero: ")
        val a : Int = (readLine()?: "0").toInt()

        print("Introduzca el segundo entero: ")
        val b : Int = (readLine()?: "0").toInt()

        val calculadora = Calculadora()

        println("suma $a + $b = ${calculadora.sumar(a, b)}")
        println("resta $a - $b = ${calculadora.restar(a, b)}")
        println("multiplica $a * $b = ${calculadora.multiplicar(a, b)}")
        try {
            println("divide $a / $b = ${calculadora.dividir(a, b)}")
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        }





    }}