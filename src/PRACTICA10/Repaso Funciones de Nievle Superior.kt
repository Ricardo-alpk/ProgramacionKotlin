package PRACTICA10

fun main(){
    println("======FUNCIONES DE NIVEL SUPERIOR======")

    tolevelprint()

    println("========Funciones Miembro========")
    Print().memberprint()

    println("===========FUNCIONES LOCALES=========")

    //se declaran dentro de otra función y solo existen dentrod de ellas
    fun localprint(){
        println("soy una función miembro")
    }
    localprint()


}

//se pueden usar desde cualquier archivo
fun tolevelprint(){
    println("soy global")
}


//estan dentro de una clase y solo se acceden desde esta clase
class Print {
    fun memberprint(){
        println("soy una función miembro")
    }

}


