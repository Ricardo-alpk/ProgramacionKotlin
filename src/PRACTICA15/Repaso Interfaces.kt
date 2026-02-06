package PRACTICA15

import java.sql.SQLOutput

fun main(){
    println("===========QUE ES UNA INTERFAZ=========")

    val thinsgcanfly = listOf(Avion(), Cohete())
    thinsgcanfly.forEach { it.volar() }

    println("============EJEMPLO DE COMO SE IMPLEMENTA UNA INTERFAZ============")

    var ejemr = Ejem()

    ejemr.m1()

    var ladron = Moro()

    ladron.explode()

    println("============DIFERENTES INTERFACES==========")

    var prueba = Box()

    prueba.quemar()
    prueba.explotar()

    println("=======RESOLVER CONFLICTO DE INTERFACES=========")
    var boxi = boxeo()

    boxi.explode()
    boxi.incinerate()

    boxi.warning()


    println("=================EJEMPLO FINAL CON TODO AÑADIDO===========")

    val drone = Drone23()
    drone.advertencia()
    drone.volar()
    drone.disparar()

}

//UNA INTERFAZ ES COMO UN CONTRATO , que define que debe hacer una clase
//pero no COMO DEBE HACERLO

/**Como hacemos en estos ejemplos de la interfaz    Volador
 * y las clases Avión y Cohete
 * */

interface Volador {
    fun volar()
}

class Avion: Volador {
    override fun volar() {
        println("EL AVIÓN DESPEGAAAA")
    }
}

class Cohete : Volador {
    override fun volar() {
        println("EL COHETE VA PAL ESPACIOoooo")
    }
}

/**COMO SE DEFINE UNA INTERFAZ*/
interface `Interfaz definición` {
    val p1: Int                 //Propiedad abstracta without valor
    val p2: Boolean             //Propiedad con getter (sin campo)
        get() = p1>0

    fun mi()                    //meotodo abstracto (body)
    fun m2(){                   //metodo con implementación
        println("ESTOS ES UN METODOS REGULARASO")
    }
}

/**COMO SE IMPLEMENTAR UNA INTERFAZ*/
interface interface2{
    val p1: Int
    fun m1()
}

class Ejem : interface2{
    override val p1: Int = 500

    override fun m1() {
        println("implementando metodo con interfaz")
    }

}

/**IMPLEMENTAR OBJETOS EXPLOSIVOS*/

interface Muslim{
    fun explode()
}

//Cualquier objeto que implemente debe tener el metodo explotar

class Moro: Muslim{
    override fun explode() {
        println("BOOOOOOMMMMMMM ")
    }
}

/**IMPLEMENTA RMULTIPLES INTERFACES*/

interface Explosivo{
    fun explotar()
}

interface Incinerar{
    fun quemar()
}

class Box: Explosivo, Incinerar{
    override fun explotar() {
        println("EXPLOTO AL COSA")
    }

    override fun quemar() {
        println("SA QUEMAO")
    }
}

/**conflictos entre interfaces*/

interface Explosive2 {
    fun explode()
    fun warning() = println("⚠️ Explosivo")
}

interface Incinerable2 {
    fun incinerate()
    fun warning() = println("🔥 Incinerable")
}

class boxeo : Explosive2, Incinerable2{
    override fun incinerate() {
        println("sa incinerao")
    }

    override fun explode() {
        println("SA REVENTAO")
    }

    override fun warning() {
        super<Incinerable2>.warning()
        super<Explosive2>.warning()
    }
}

/**Ejemplo final con todo implementado*/

interface Volador23 {
    fun volar()
    fun advertencia() = println("⚠️ Peligro: este objeto vuela")
}

interface Disparable23 {
    fun disparar()
    fun advertencia() = println("💥 Este objeto dispara")
}

class Drone23 : Volador23, Disparable23 {
    override fun volar() = println("🛸 El dron se eleva")
    override fun disparar() = println("🔫 Disparando rayos láser")

    override fun advertencia() {
        super<Volador23>.advertencia()
        super<Disparable23>.advertencia()
    }
}



