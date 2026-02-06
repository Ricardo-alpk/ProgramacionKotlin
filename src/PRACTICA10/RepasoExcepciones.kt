package PRACTICA10

import java.io.FileInputStream
import kotlin.random.Random

//Con esto manejamos errores p mi king

fun main(){
    println("introduce un texto")

    val text = readLine()?: "0"

    if(text.isNullOrBlank()){
        throw IllegalArgumentException("Entrada invalida")
    }

    //MANEJAR EXCEPCIONES CON TRY-CATCH

    try{ //codigo a fallar que puede fallar
        println("otro mas por si aca")

        val num = readLine()?.toDouble()
    } catch (e: NumberFormatException){ // lo que hara si ocrre algún fallo
        println("FORMATO INCORRECTO: $e" )
    } finally { //se ejecuta siempre, haya error o no (bueno para liberar recursos)
        println("FINAL DEL BLOQUE DAAAAA")
    }

    //Excepciones marcadas
    /**🚫 Excepciones marcadas (checked exceptions)

    En Kotlin no existen las excepciones “marcadas” como en Java.

    No estás obligado a poner throws ni a capturarlas con try/catch.

    Pero sí puedes hacerlo si quieres manejar el error tú mismo.
     * */
    val stream = FileInputStream("archivo_inexistente") //esot compila, pero falla al ejecutarse

}


//Ejemplo con valor por defecto
/*
fun String.toDoubleorDefault(default: Double ) {
    try {
        toDouble()
    } catch (e: NumberFormatException) { //SI NO SE PUEDE CONVERTIR, SE DEVULVE EL VALOR POR DEFECTO
        default
    }
}*/