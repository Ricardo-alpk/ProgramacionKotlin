package PRACTICA10

class CalculadoraCuerpoExpresion {


    fun sumar(a: Int?, b: Int?): Int = (a ?: 0) + (b ?: 0) //esto son funciones con cuerpos de expresión

    fun restar(a: Int?, b: Int?): Int = (a ?: 0) - (b ?: 0)

    fun multiplicar(a: Int?, b: Int?): Int = (a ?: 0) * (b ?: 0)

    fun dividir(a: Int?, b: Int?): Double =
        if (b == null || b == 0) throw IllegalArgumentException("No se puede dividir por cero o null")
        else (a ?: 0).toDouble() / (b ?: 0).toDouble()

    fun saludar(nombre: String?, tratamiento: String? = "Sr.") : String = "Buenos días $tratamiento ${nombre?:""}"
}