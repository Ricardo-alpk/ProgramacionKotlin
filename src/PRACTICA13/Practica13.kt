package PRACTICA13
/**Práctica 13: Uso de “companion object”
1.- Crear la clase Contador dentro del fichero “Companion.kt”:
2.- Definir una propiedad compartida llamada contador de tipo Int utilizando companion object.
3.- Crear un método companion llamado imprimirValor que muestre por consola el valor actual de contador.
4.- Añadir un método de instancia (sin companion) llamado aumentarContador que incremente el valor de contador.
5.- Crear un main que haga lo siguiente:
a) Incrementar directamente desde la clase Contador el valor de contador 4 veces.
b) Llamar a Contador.imprimirValor() para mostrar el valor actual (debe mostrar 4).
c) Crear una instancia de Contador, llamar a aumentarContador() una vez y volver a imprimir el valor (debe mostrar 5).*/

class Contador {

    companion object {
        // Miembros "estáticos" aquí
        var contador: Int = 0
        fun imprimirValor() {
            println("Valor actual del contador: $contador")
        }
    }

    fun aumentarContador() {
        contador++   // accedemos a la propiedad del companion
    }
}

fun main() {
    // Incrementar 4 veces desde la clase (companion)

    println("Incremento por 4 veces")
    Contador.contador++
    Contador.contador++
    Contador.contador++
    Contador.contador++
    Contador.imprimirValor()   // Debería mostrar 4

    println()
    // Crear instancia y aumentar contador una vez más
    val instancia = Contador()
    instancia.aumentarContador()
    Contador.imprimirValor()   // Debería mostrar 5
}