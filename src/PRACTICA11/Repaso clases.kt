package PRACTICA11

fun main() {
    //Instancias Objetos
    val micoche = coche()

    micoche.acelerar() //aplicamos la función que cambiara la velocidad del carro

    println(micoche.velocidad) // e imprimimoes el resuldato

    //Ejemplo avión

    val avionchill = avion()

    avionchill.moverderecha()

    println("la posición del avión es : [${avionchill.x}],[${avionchill.y}]")



}

//Ejemplo con la clase Coche
class coche{

    //una clase es una plantilla para crear objetos
    //con sus propiedad (atributos), y metodos(funciones)

    var marca = "Toyota"
    var velocidad = 0

    fun acelerar(){
        velocidad += 10
    }
}

//otro ejemplo
class avion{
    var x = 0
    var y = 0

    fun moverderecha(){
        if(x<300){
            x++
        }
    }

    fun moverizquierda(){
        if(x>0){
            x--
        }
    }
}