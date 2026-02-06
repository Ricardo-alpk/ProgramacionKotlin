package PracticasSinClasificar

open class Character(val name:String){
    open fun die() = println("morir")
}

class Mage(name: String) : Character(name){
    override fun die() {
        println("Mago muriendo")
    }
}

fun main() {
    val jaina = Mage("Jaina")
    jaina.die()
}