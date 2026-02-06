package PRACTICA14

fun main(){

    println("=====PRUEBA EN EL MAIN=====")

    val circulo1 = Circulo()

}


/**Las clases abstractas [NO] se pueden instanciar
 *
 * Puede tener
 *
 * Metodos abstractos (SIN CUERPO -> LAS SUBCLASES DEBEN IMPLEMENTARLO)
 * Y
 * Metodos Normales
 *
 * sirve d emolde para las clases hijas*/

/**EJEMPLO*/
abstract class Figura{
    abstract fun area(): Double
    abstract fun perimetro(): Double


    fun descripcion(){
        println("OE, SOY UNA FIGURA GEOMETRICA")
    }
}

/**SUBCLASES QUE IMPLEMENTAN LOS MÉTODOS ABSTRACTOS*/

/**Ejemplo 1*/
class Cuadrado(private val lado: Double): Figura(){
    /**Aqui nos saldra error hasta que implementemos los metodos de la clase abstracta*/
    override fun perimetro() = lado * 4

    override fun area() = lado * lado

}

/**Ejemplo 2*/

class Circulo(private val radio: Double): Figura(){
    override fun perimetro() = Math.PI * radio * radio

    override fun area() = 2 * Math.PI * radio
}