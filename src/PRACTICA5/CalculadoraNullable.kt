package PRACTICA5

class CalculadoraNullable {
    fun sumar(a : Int?, b: Int?) : Int {
        return (a?: 0) + (b?: 0)
    }

    fun restar (a: Int?, b: Int?): Int{
        return (a?: 0) - (b?: 0)
    }

    fun multi (a: Int?, b: Int?): Int{
        return (a?: 0) * (b?: 0)
    }

    fun divi (a: Int?, b: Int?): Double{
        val divisor = b?:0
        if(b == 0){
            throw IllegalArgumentException ("ERROR CRACK, NO SE PUEDE DIVIDIR ENRE CERO")
        }
        return (a ?: 0).toDouble() / (b ?: 0).toDouble()
    }
}