package `ELEMENTOS BASICOS`
fun main(){
    //Conversiones explicitas
    val level:Short = 75
    //val first: Int = level // seria el error

    val first2: Int = level.toInt()

    println(first2)

    //Metodos de Conversion


    // Redondeo y truncado en conversiones explícitas
    val measure = 4005215
    print("toshort():${measure.toShort()}")


}
