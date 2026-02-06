package PRACTICA4

class Calculadora {
    fun sumar(a : Int, b: Int) : Int {
        return a + b
    }

    fun restar (a: Int, b: Int): Int{
        return a-b
    }

    fun multi (a: Int, b: Int): Int{
        return a*b
    }

    fun divi (a: Int, b: Int): Double{
        if(b == 0){
            throw IllegalArgumentException ("ERROR CRACK, NO SE PUEDE DIVIDIR ENRE CERO")
        }
        return a.toDouble() / b.toDouble()
    }


}

