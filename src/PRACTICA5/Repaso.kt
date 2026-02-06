package PRACTICA5

fun main(){
    println("==========Posibles nullables==========")

    var nonullable :String = "HOLA"
    //nonullable = null //❌

    var sinullable :String? = "HOLA"
    sinullable = null //✅

    println("======asignaciones anullables======")

    val pass: String? = null
    val passsize = pass?.length

    println(passsize)

    println("========OPERADOR ELVIS=========")
    val pass2 :String? = null
    val passize2 = pass?.length ?: 0

    println(passize2)


    println("============ASERCIÓN NOT NULL==========")

    val contador :Int? = null

    println(contador!!.dec()) //esto quiere decir: bro confie, esto no es null
    // dara error obieamente por estamos estafando al IDE






}

//comprobar si algo es null

fun mostrarlista (beasts: List<String>?){
    if(beasts != null && beasts.isNotEmpty()){
        beasts.forEach { println(it) }
    }
}