package PRACTICA8.ControlFlujo

fun main(){
    println("=====EJERCICIO VALIDADOR DE NOTAS=====")

    var notasPuestas: Double = 0.0
    var ciclo: Int = 0

    try {
        while (true) {
            println("Introduce una nota")
            var nota: Double = (readLine() ?: "0").toDouble()



            if (nota < 0) break

            if (nota > 10) {
                println("Nota invalida, IGNORANDO...")
                continue
            }

            //Ahora si no salimos y reiniciamos ahora si sumamos y contamos

            notasPuestas += nota
            ciclo++


        }

        var promedio : Double = (notasPuestas / ciclo)
        println("Se introdujo $ciclo notas validas.")
        println("El promedio final es: $promedio")

    } catch (e : NumberFormatException){
        println("DEBE INTRODUCIR NUMEROS DECIMALES")
    }

}