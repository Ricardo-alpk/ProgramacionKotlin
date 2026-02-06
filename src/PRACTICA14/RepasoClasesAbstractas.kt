package PRACTICA14


fun main(){

    println("===========CLASES ABSTRACTAS=============")

    //val f = Figura() // do dejara hacerlo por que no se pueden instanciar clases abstractas

    val ataques : List<attack> = listOf(
        cabezazo(),
        puñetazo(),
        puñalada()
    )

    ataques.forEach { println(it.ejecutar()) } // con cada it nos referimos a cada elemnto actual de la lista
    //yt con el for each recorremos TODA la lista (es una forma)

}

//No se pueden instanciar directamente
abstract class Figura{
    abstract fun area(): Double  //Obligatorio en las Hijas

    fun describir() = println("HELLO, SOY UNA FIGURA")
}
//Son como una plantilla general para otras clases hijas

abstract class ClaseAbs{
    abstract val valor :Int
    abstract fun hacerAlgo()

    fun metodoNormal(){
        println("ESTO YA VIENE IMPLEMENTADO")
    }

}

//En las subclases tienes que implementar lo Abstracto

class Subclase: ClaseAbs(){
    override val valor: Int = 10

    override fun hacerAlgo() {
        println("hare algo con $valor")
    }

}
//NO HACE FALTRA PONER EL OPEN EN LAS CLASES ABSTRACTAS

abstract class attack{
    val danhobase: Int = 10

    abstract fun ejecutar() :String //es una función abstracta por que cada ataque lo implementa a su manera
}

//Clases complleta sque heredan de attack

class cabezazo : attack(){
    override fun ejecutar(): String {
        return "DISTE UN GRAN CABEZAZO, DAÑO: ${danhobase + 15}"
    }
}


class puñetazo : attack(){
    override fun ejecutar(): String {
        return "DISTE UN GRAN PUÑETAZO, DAÑO: ${danhobase + 22}"
    }
}

class puñalada : attack(){
    override fun ejecutar(): String {
        return "DISTE UNA GRAN PUÑALADA, DAÑO: ${danhobase + 50}"
    }
}