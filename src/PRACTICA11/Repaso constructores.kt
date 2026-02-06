package PRACTICA11

//Existen 2 tipos: Constructor primario y secundario

fun main(){
    println("=================CONSTRUCTOR PRIMARIO===========")
    val espada= arma(5,4.6)

    println("ESTADS: \n" +
            "Ataque: ${espada.ataque} \n" +
            "Velocidad: ${espada.velocidad}")

    println("==============con bloque INIT==================")

    val bazooka = arma2(25,6.6)

    println("=======constructor secundario===========")

    var c1 = contacto("PEDRITO")

    var c2 = contacto("C-100","Lucy")

    println("User 1 : ${c1.id} , ${c1.nombre}")
    println("User 2 :  ${c2.id} , ${c2.nombre}")

    println("\n============VISIBILIDAD DE CONSTRUCTORES==========")

    //var lib = libro(200) // no nos va a dejar crearlo por que el constructor es private

    println("\n ==========modificadores de VISIBILIDAD========")

    println("public (por defecto)\tEn todo el proyecto\t\t\t\t\tLo más abierto\n" +
            "internal\t \t\t\tSolo dentro del módulo\t\t\t\tIdeal para apps grandes\n" +
            "protected\t\t\t\tSolo en la clase y sus subclases\tHerencia controlada\n" +
            "private\t\t\t\t\tSolo dentro de la clase o archivo\tTotalmente oculto")


}

//constructo primario (el mas comun , mas mid, mas promedio)
class arma(val ataque: Int,val velocidad : Double)

//bloque init , ESTO PASA CUANOD QUIERES QUE PASE ALGO NADA MAS SE CREE EL OBJETO

class arma2(ataque: Int, velocidad: Double) {
    val ataque: Int
    val velocidad: Double

    init {
        this.ataque = ataque
        this.velocidad = velocidad
        println("Arma creada con ataque $ataque")
    }
}

//Constructor secundario
class contacto(var nombre :String){

    var id: String

    //se ejecuta siempre al crear el objeto
    init {
        id = "AUTO" + System.currentTimeMillis()
    }

    //constructor secundario
    constructor(id: String, nombre: String): this (nombre){
        this.id=id
    }


}

//Podmos limitar quien pueda crear objetos

class libro private constructor(val pag: Int)