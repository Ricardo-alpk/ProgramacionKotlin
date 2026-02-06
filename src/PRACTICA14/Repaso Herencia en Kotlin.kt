package PRACTICA14

fun main(){
    println("==========HERENCIA EN KOTLIN========")
    /*open class Personaje // el open hace que sea HEREDABLE, hai que ponerlo ya que por defecto las clases son FINAL

    class Mago : Personaje() //Mago hereda de Personaje*/

    /*TODO se pueden ceclarar clases dentro del main pero mejor
    *  no lo hagamos ya que no es lo normal ni lo habitual*/

    var mago = Mago3("NOSTRADAMUS")

    mago.die()


    println("============SOBREESCRIBIR PROPIEDADES===========")
    val lapiz = ItemMid("LAPIZ")

    val compas = ItemPopular("BOLIGRAFO")

    println("${lapiz.name} x ${compas.cantidad}")
    println("${compas.name} x ${lapiz.cantidad}")


    /**REGLA IMPORTANTE QUE VA A MISA:
     *
     * Padre val → hija puede usar val o var.
     *
     * Padre var → hija no puede reducirlo a val.
     * */

}


//La herencia es cuando una clase hija, reutiliza y amplía los que tiene una clase padre.
//clase padre = la SUPERCLASE   *omniman*
//clase hija = la USBCLASE      *invincible*

/**Personaje → tiene nombre, vida, método atacar().
 * Mago, Guerrero → heredan de Personaje, pero cada uno ataca distinto.
 * */

//Aunque no lo pongamos, en kolin TODAS las clases heredan de la clase ANY

//EJEMP: class Ejemplo  // en realidad es: class Ejemplo : Any()

open class Personaje // el open hace que sea HEREDABLE, hai que ponerlo ya que por defecto las clases son FINAL

class Mago : Personaje() //Mago hereda de Personaje

/*===============HERENCIA CON CONSTRUCTOR PRIMARIO=============*/

//Si la fathe class tiene un constructr primario con parametros
// la subclase tiene que llama tambn as ese

open class Personaje2(val nombre: String)

//Aqui mago le pasa la info al constructor de personaje
class Mago2 (nombre: String) : Personaje2 (nombre)



/*================HERENCIA CON CONSTRUCTOR SECUNDARIO===========*/

open class xmen (val damage: Int, val Speed: Double)

class Wolverine : xmen {
    constructor(damage: Int, Speed: Double) : super(damage, Speed) //llama al constructor de XMEN

    //super(...) se usa SIEMPRE dentro del constructor secundario
}



/*=====================SOBREESCRIBIR METODOS=====================*/

open class character(val name: String){
    open fun die(){
        println("PERSONAJE MURIENDO...")
    }
}


class Mago3(name:String) : character(name){
    override fun die(){
        println("MAGO ${name} MURIENDO PERO MAS GUAY.....")
    }
}

/**=============SOBREESCRIBIR PROPIEDADES================*/

open class ItemMid(val name: String){
    open var cantidad = 1 //se puede tambien heredar estas propiedades/atributos
}

class ItemPopular(name: String): ItemMid(name){
    override var cantidad = 6
}