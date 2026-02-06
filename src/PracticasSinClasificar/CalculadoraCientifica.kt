package PracticasSinClasificar

import kotlin.math.pow
import kotlin.math.sqrt

class CalculadoraCientifica(num1: Double, num2: Double) : CalculadoraBase(num1,num2) {
    fun cuadrado() = num1.pow(2)
    fun raizCuadrada() = sqrt(this.num1)
}
