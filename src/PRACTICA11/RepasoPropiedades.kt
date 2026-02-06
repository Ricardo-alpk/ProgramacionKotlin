package PRACTICA11

fun main(){
    val p = persona()

    p.nombre = "Rick"
    println("${p.nombre}")

}


//Propiedad , lo que hace aqui es que podemos
class persona{
    var nombre: String = "No Name"
}