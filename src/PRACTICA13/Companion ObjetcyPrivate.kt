package PRACTICA13

fun main(){
    println("============Singleton=============")
    var c1 = Configuracion.instancia

    var c2 = Configuracion.instancia

    println(c1 === c2) //cuando pregunta con triple'=' esta comparando si es el mismo objeto en MEMORIA
    //no solo en contenido
    /** == : si son iguales
     * === : si son literalmente la misma cosa
     * */

    println("=========EJEMPLO COMPANION OBJECT========")

    val userxd = Usuario34.crear("RICK")

    println(userxd.nombre)

    println("\n ===========FABRICA DE OBJETOS==========")

    val an1 = Animal.crearPerro()

    val an2 = Animal.crearGato()

    println("${an1.tipo}")
    println("${an2.tipo}")
}

//Usar CompanionObject + PrivateConstructor es muy util para patrones de diseños(Singleton) o fabricas de objetos
//Singleton
class Configuracion private constructor(){
    companion object {
        val instancia = Configuracion()
    }

    var modoOscuro = false

}

//fabrica de objetos


class Animal private constructor(val tipo: String){
    companion object{
        fun crearPerro() = Animal("Perro")
        fun crearGato() = Animal("Gato")
    }
}


/***RECORDATORIO
 * El companion object NO es una clase llamandose a si misma
 * si no una Sección DENTRO DE LA CLASE que actúa como su ayudante estatico
 *
 * Ejemplo:
 */

class Usuario34 {
    val nombre: String

    //Contructor estatico
    constructor(nombre: String){
        this.nombre = nombre
    }

    //companion object
    companion object{
        fun crear(nombre: String): Usuario34 {
            return Usuario34(nombre)
        }
    }

}
