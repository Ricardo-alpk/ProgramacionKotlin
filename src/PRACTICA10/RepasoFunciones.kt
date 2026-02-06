package PRACTICA10

import java.sql.SQLOutput

fun main(){
    //ayyy funciones mis viejas enemigas

    println("INTRUCE UN VALOR")

    var num = readLine()?: "0"

    var numint = num.toInt()


    var numresult = square(numint)
    println("Resultado: $numresult")


    println("============RETORNO TIPO UNIT===========")

    saludar("rick")

    println("==============Argumento e funciones===========")


    println(loadCustomer(1))

    println(loadCustomer2(1,2))

    println("==========FUNCIÓN CON ARGUMENTOS VARIABLES===========")
    println(maxlenght("holaaaaa"))

    println("============OPERAODRES SPREAD (*)=================")
    //spread (*) se le puede pasar un array completo a un parámetro vvarag

    val palabras = arrayOf("casa", "perro", "silla", "xd")
    println(maxlenght(*palabras))






}

fun square (x: Int): Int {
    return  x*x
}

/*
//palabra clave     //nombre    //parámetro     //tipo de retorno
fun                 square      (x: Int):       Int {

    //valor que devuelve
    return  x*x
    }
 */

/*version de una linea
fun square2(x: Int) = x * x
*/

//RETORNO TIPO UNIT

fun saludar(nombre: String): Unit{ //unit quiere decir que no devuelve NADA
    println("HOLA $nombre")
}

//o directamente no pongamos nada

fun saludar2 (nombre: String){
    println("hola $nombre")
}


//==============Argumento e funciones===========
// ARGUMENTOS POR DEFECTO
//definimos valores si no se pasa ninguno
val customers = arrayOf("Carlos", "Miguel", "Ximena")
fun loadCustomer(limit: Int = 0): String {
    return customers[limit]
}

//Argumentos nombrados
fun loadCustomer2(limit: Int = 0, lenght: Int): String{
    return customers[limit].take(lenght)
}

//Funciones con argumentos variables
//vararg permite pasar cantidad variable de argumentos del mismo tipo

fun maxlenght(vararg words: String): Int {
    var max = 0
    for (word in words){
        if(word.length > max){
            max = word.length
        }
    }
    return max
}
