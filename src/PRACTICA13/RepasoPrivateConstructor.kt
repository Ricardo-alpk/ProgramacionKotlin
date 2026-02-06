package PRACTICA13

fun main(){
    //var user = Usuario3("Ana") // no se puede por que el constructor es privado

    var ui = User.crear("Rick")

    var ea = User.crear("XD")

}

//Para que sirve
/** El private constructor bloquea el uso del constructor fuera de la clase
 * Solo el codigo dentro de la clase puede crear instancias*/

class Usuario3 private constructor(val nombre: String)

/**Ahora tu diras, Pero Rick, pa que chucha sive el private constructor
 */

class User private constructor(val nombre: String){
    companion object{
        fun crear (nombre: String): User{
            println("CREANDO USUARIO INVALIDO...")
            if (nombre.isNotBlank()){
                return User(nombre)
            } else {
                throw IllegalArgumentException ("NOMBRE VACIO, NO PERMITIDO")
            }
        }
    }

}