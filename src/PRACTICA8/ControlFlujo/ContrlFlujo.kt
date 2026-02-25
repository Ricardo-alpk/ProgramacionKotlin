package PRACTICA8.ControlFlujo

fun main() {
    print("REPASO BUCLES FOR" +
            "Aqui el For se usa para recorrer rango y colecciones")
    println(" ")
    for(i in 0..5){
        println("HOLA N:" + i)
    }

    //con el until (hasta)
    //llegara hasta el 4
    println(" ")
    for(i in 0 until 5){
        println("HOLA DE NUEVO N:" + i)
    }

    //Hacia atras
    println(" ")
    for (i in 10 downTo 1){
        println("Hola por 3ra vez:" + i)
    }

    //Con Saltos (en este caso de 2 en 2)
    println(" ")
    for(i in 1.. 10 step 2){
        println("HOLA POR CUARTA VEZ: " + i)
    }

    //Ejercicio - Crear una tabla de multiplicar

    println("Introduce un numero para crear una tabla de multiplicar")

    val num : Int = (readLine() ?: "0").toInt()

    for(i in 1..10){
        println("${num} x ${i} = ${num * i} ")
    }




}