package `ELEMENTOS BASICOS`

fun main(){
    //Tipos primitivos

    //Enteros
    val level: Byte= 50
    val health: Short = 150
    val missionPoints: Int = 40000
    val experience: Long = 123456788
    val monsterExecuted = 999987654355L //La L especifica al tipo Long


    //escribir numero en binario
    val bitmalLocation = 0b00100001 //siempre debe empezar por la 0 y b de binario

    //hexadecimal
    val chestColor = 0xCCC //

    println(bitmalLocation)
    println(chestColor)

    val attackSpeed: Float = 0.5f
    val dodgeChance: Double = 0.2

    //Literales reales
    println("")
    println("Literales Reales")
    val exp1 = 3.211e2
    val exp2 = .00001e10
    val exp3 = 48e5
    val exp4 = 10e-4

    println(exp1)
    println(exp2)
    println(exp3)
    println(exp4)

    //Caracteres especiales
    println("Caracteres especiales")
    val response: Char = 'Y'
    println(response)

    //Caracteres Especiales
    /*\t: Tabulación
    \b: Retroceso
    \r: Retorno de carro
    \n: Salto de línea
    \': Apostrofe
    \": Comilla doble
    \\: Backslash
    \$: Símbolo de dólar
    \u+XXXX: Símbolo Unicode con 4 dígitos hexadecimales
    */

    println("UNO\nDos\nTres")




}