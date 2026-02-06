package PracticasSinClasificar

fun main() {

    val negativeNumbers = Array(10) { -(it + 1)}
    println (negativeNumbers.joinToString ())

    val planets = arrayOfNulls<String>(8)
    planets[0] = "Mercurio"
    planets[1] = "Venus"
    planets[2] = "Tierra"
    planets[3] = "Júpiter"
    planets[4] = "Saturno"
    planets[5] = "Urano"
    planets[6] = "Neptuno"
    planets[7] = "Plutón"

    for(i in planets.indices){
        println("${planets[i]} esta en la posición ${i+1}")
    }

    val income = arrayOf<Double>(
        0.5, 2.5, 4.0, 5.0,
        4.5, 6.0, 7.6, 8.0,
        5.0, 6.4, 4.0, 9.1

    )
    println(income.joinToString())






}