package PRACTICA16

import java.sql.SQLOutput

fun main(){
   val pair = Pair("Lima",20)

    val nombre = pair.first
    var edad = pair.second

    println("=========TAMBIEDN SE PUEDE HACER ESTO==========")

    val(name, champion ) = Pair("RICK", 25)

    println("nombre ${name}, victorias: ${champion}")

    //Es como abrir una “caja” (Pair) y sacar sus dos valores directamente.

    println("==================EJEMPLO BASICO CON PAIR==================")

    val ciudad23 = "Madrid" to 15 // el "to" solamente crea valores de 2

    val (name23, edad23) = ciudad23

    println("Nombre: $name23")

    println("Edad: $edad23")

    println("-----ACCEDER MANUALMENTE-----")

    println(ciudad23.component1())
    println(ciudad23.component2())

    println("=============IGNORAR VALORES CON UN BARRA BAJA '_' =============")
    val center = Triple(2,0,4)
    val(_,_,r) = center
    println(r)

    println("============DESESTRUCTURAR BUCLES FOR=========")

    val numbers = intArrayOf(1,45,7,4,2,56,6)

    for((index,number) in numbers.withIndex()){
        if((index +1) % 2 == 0){ // esta condición dice que imprima solo los que esta en posicione spares
            println(number)
        }
    }

    println("==========desestructurar en data class=======")
    val(vida,velosidad) = Troll(150,89.76)

    println("EL TROLL TIENE $vida pts de vida y puede runnear a una velocidad de $velosidad km/h")

    println("=====================DESESTRUCTURAR SIN DATA CLASS=====================")

    val(vida2,velox2) = Troll2(300,546.4)

    println("EL TROLASO TIENE $vida2 pts de vida y puede runnear a una velocidad de $velox2 km/h") //acuerdate de usar el operator

    /*tambien se puede desestruturar en mapas gracias a extensiones internas en kotlin*/

    println("===========DESESCTRUCTURAR EN LAMBDAS=========")
    val shampoos = mapOf(
        "Palta" to "verde",
        "Guanabano" to "naranja",
        "Coco" to "marron",
        "Manzana" to "Rojo"
    )

    for((nombre54,tipo54) in shampoos){
        println("El shampo $nombre54 es de color $tipo54")
    }

    println("==================DESESTRUCTURACIÓN EN LAMBDAS==================")

    val champu = mapOf(
        "Buticaba" to "liso",
        "Pinorelo" to "Crespo"
    )

    champu.forEach { (nombre,tipo) ->
        println("$nombre -> $tipo")
    }


}
/**
 * La desestructuración permite desepmaquetar un solo objeto en
 * varias variables
 *
 * Cada obejto "desestructurable" tiene funciones que se llaman "componentN" (component1, component2 ...)
 *
 * val (nombre, champions) = pair
 *
 * es lo mismo que:
 * val nombre = pair.component1()
 * val champions = pair.component2()
 *
 * Esto aplica a:
 * Pair -> Tiene 2 componentes
 * Triple -> Tiene 3 componentes
 * data class -> genete automat. un componente por cada propiedad del constructor
 * */

//Desestructurar en data class
data class Troll(val salud:Int, val speed:Double)

//DESESTRUCTURAR SIN DATA CLAS
class Troll2(val health: Int, val speed: Double) {
    operator fun component1() = health      //todo si o si hay que poner OPERATION para poder usar la sintaxis de desestructuración
    operator fun component2() = speed
}

//Desestructuración en Mapas