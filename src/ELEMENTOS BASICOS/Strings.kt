package `ELEMENTOS BASICOS`

fun main(){
    //para hacer strings tenemos que ponerle class
    //class String: Comparable<String>, CharSequence

    val customerName:String = "Claudia Martinez"
    //val customerName = "Claudia Martinez"

    println(customerName[5])
    println(customerName.get(5))

    for(char in customerName){
        print(char)
    }

    for (index in customerName.indices){
        println(customerName[index])
    }


    println(customerName.length) //16


    //concatenación

    val a = "jose" + " Monteira"
    val b = "Cantidad de ahorros: " + 536.65
    val c = "Resultado: " + (2+4)


    var d = "Nueva concatenacion"

    d += '!'

    //con sangria

    val welcomeText = """
        |¡Bienvenido a la guía de Kotlin de develou.com!
        |En esta serie de tutoriales aprenderás 
        |los conceptos básicos sobre el lenguaje
        |y las herramientas necesarias para probarlo
    """.trimMargin()

    println(welcomeText)
}