package PracticasSinClasificar

class Coche(
    val marca: String,
    val modelo: String
    ) {

    var velocidad: Int = 0    // velocidad es var por que va a ir cambiando frecentemente
        private set //get = obtener , set = modificar , y private quiere decir que solo va a ser visible desde el archivo actual

    constructor(marca: String, modelo: String, velocidadInicial: Int) : this(marca, modelo) {
        if (velocidadInicial >= 0) {
            velocidad = velocidadInicial
        }
    }

    //fun


}