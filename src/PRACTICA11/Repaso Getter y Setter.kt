package PRACTICA11

fun main(){
    var ani = Animal(15)

    println("El animal es adulto: ${ani.esAdulto}")

    ani.peso = 4.4

    println("${ani.peso}")

    /**EJEMPLO IMPORTANTE
     * fun main() {
     *     val perro = Animal()
     *
     *     perro.peso = 120.0     // ✅ Podemos modificar peso
     *     println(perro.sobrepeso) // ✅ Podemos leer sobrepeso → true
     *
     *     // ❌ Pero no podemos hacer esto:
     *     // perro.sobrepeso = false   --> ERROR de compilación
     * }
     * */
}

class Animal (var edad: Int){
    val esAdulto: Boolean
        get() = edad > 1

    var peso = 0.0

        set(valor){
            field = valor //el field es la referencia interna al valor de la propiedad
            println("Peso actual: $valor kg")
        }
}