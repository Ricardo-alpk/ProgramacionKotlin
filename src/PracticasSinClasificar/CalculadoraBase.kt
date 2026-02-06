package PracticasSinClasificar

open class CalculadoraBase (val num1: Double, val num2: Double){
    fun sumar () {
        num1 + num2 //declaro la funcion sumar
    }
    fun restar (){
        num1 - num2
    }
    fun multi (){
        num1 * num2
    }
    fun divi () {
        if (num2 == 0.0){
            throw IllegalArgumentException  ("No se puede dividir por cero o null")
        } else {
            num1 / num2
        }
    }





}


