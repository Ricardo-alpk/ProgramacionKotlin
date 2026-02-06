package PRACTICA3

fun main(){

    //array chill

    val arrstr = arrayOf<Double>(
        0.5, 2.5, 4.0, 5.0,
        4.5, 6.0, 7.6, 8.0,
        5.0, 6.4, 4.0, 9.1
        )

    val arrint = arrayOf<Int>(
        3,4,5,6,3,2
    )

    println("${arrint[3]} ");

    println("===========OTRO============ " + "\n")
    //recorrer arrais con el bucle
    for( i in arrstr.indices){
        print("${arrstr[i]} ,")
    }

    println("\n")


    println("==========CONSTRUCTOR DE ARRAYS=========== ")
    val negativeNumbers = Array(10) {- (it +1)}
    println(negativeNumbers.joinToString())

    println("=============Acceso a elementos==========")

    val planets = arrayOfNulls<String>(8) // inicialmente se crean con null
    //array of null pone por defecto cada hueco de array en null hasta que le demos valor
    planets[0] = "Mercurio"
    planets[1] = "Venus"
    planets[2] = "Tierra"
    planets[3] = "Júpiter"
    planets[4] = "Saturno"
    planets[5] = "Urano"
    planets[6] = "Neptuno"
    planets[7] = "Plutón"

    println(planets.contentToString()) // usamos esto por que con .toString da error

    println(planets.toString()) // como esto

    println("===================RECORRER EL ARRAYS======================")
    for(i in planets.indices){
        println(planets[i] + " esta en la posición ${i+1}")
        //println("${planets[i]} está en la posición  ${i+1}")
    }
    /** Esto es lo mismo solo que todo dentro de las comillas
     * println("${planets[i]} está en la posición  ${i+1}")
     * */

    println("=============ATRIBUTO SIZE=============")

    for(i in 0 until planets.size){
        println("${planets[i]} está en la posición ${i+1}")
    }

    println("=========FOREACHINDEXED()================")

    planets.forEachIndexed { i, v ->
        println("$v está en la posi ción ${i +1}")
    }



}