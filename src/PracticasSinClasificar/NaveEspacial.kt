package PracticasSinClasificar

class NaveEspacial (var nombre: String,
                    val tamaño: Int ) {
    var velocidad: Int = 0

    fun volar(){
        velocidad = 100
    }

    fun estaVolando(): Boolean{
        return velocidad<0
    }
}