package PRACTICA13

import PRACTICA10.saludar
import PRACTICA10.saludar2

fun main(){
    println("=====COMPANION OBJECT======")
    Usuario.saludar() //no necesito instanciar un usuario

    //sin companion object
    var use = Usuario("rick")

    //use.saludar() // no funcionara si saludar no es parte de un companion object

    println("==========SE PUEDEN GUARDAR VARIABLES Y CONSTANTES==========")

    println(AppConfig.version)

    println("USUARIOS ONLINE : ${AppConfig.usuariosConectado}")





}

/*En kotlin no existen los atributos o metodos staticos como en java,
en vez de eso se usa el companion object
El companion object me permite tener "cosas compartidas" entre
todas la instancias de la clase*/

class Usuario(val nombre: String) {
    companion object {
        fun saludar() {
            println("¡Hola desde el companion object!")
        }
    }
}

//Se pueden guardar variables y constantes

class AppConfig(){
    companion object{
        const val version = "1.0.0"
        var usuariosConectado = 0
    }
}

//Todo lo que esta dentro del Companion Object pretenece a la clase o al objeto, por tanto no necesita ser instanciado, gaaaaaa