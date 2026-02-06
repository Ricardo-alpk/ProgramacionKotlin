package PRACTICA14

fun main(){
    println("============USO EN EL MAIN===========\n")
    val perro = Perro("Rocko")
    perro.sonido()
    perro.dormir()

    println("=======EJEMPLO GATO=======\n")

    val gato = Gato("Michi", "Negro")
    gato.dormir()
    gato.sonido()
    println("${gato.nombre} es de color ${gato.color}")
    gato.ronronear()

}



/**Siempre
 * para poder heredar la herencia la clase debe ser open*/

open class Animal(val nombre: String){
    fun dormir(){
        println("$nombre está durmiendo")
    }
    /**open fun sonido, permite que las clases se puedan sobreescribir
     * si no lo marcamos como [open] no lopodemos sobreescribir*/
    open fun sonido() {
        println("$nombre hace un sonido, karajo")
    }
}

/**Clase que heredara*/
class Perro(nombre: String): Animal(nombre){
    override fun sonido(){
        println("$nombre ladra: !Guau p¡")
    }
    /**Lo que pasa aqui es que la clase [perro], hereda de [Animal],
     *e implementa overridea la funcion [sonido]
     * */
}


/**Herencia con propiedades y métodos extra*/

class Gato(nombre: String,  val color: String): Animal(nombre){
    override fun sonido() {
        println("$nombre maúlla: MIAU causa")
    }

    fun ronronear(){
        println("$nombre está ronroneando, gato kbro")
    }
}


/**Herencia y constructores
 * Podemos pasar al constructor del pare o pasar valores*/

open class Persona(val nombre: String, val edad: Int)

class Estudiante(nombre: String,edad: Int, curso: String) : Persona(nombre,edad)

/**Clases selladas esto es util
 *
 * Permiten herencia restríngida en el mismo archivo.
 *
 * NO son abstractas, pero se usan mucho*/

sealed class Resultado
class Exito(val mensaje: String): Resultado()
class Error(val codigo: Int) : Resultado()

