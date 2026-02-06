package PracticasSinClasificar
/*Crear un programa que pida una cadena e texto por pantalla
* que pida un numero entero que representee una posición dentro de esa cadena
* 3 Muestre por pantalla:
    El carácter correspondiente a esa posición.
    El carácter anterior al de esa posición (si existe).
    El carácter siguiente al de esa posición (si existe).
    Maneje correctamente los posibles errores (por ejemplo, si la posición está fuera de los límites de la cadena).
*/

fun main(){
    println("ESCRIBE UN TEXTO")

    val text : String = readLine()?: "" //despues del read line es buena idea poner "?: """

    println("OK, AHORA ESCRIBE UN NUMERO PARA VER A QUE POSICIÓN DEL TEXTO CORRESPONDE")

    var num : String = readLine()?: "0"
    var pos = num.toInt()

    //var posi = text.length

    if(text.length <= pos){
        println("Error")
    } else{
        println(text.get(pos)) //imprimimmos la posicion escrita
    }

            if (((pos - 1) < 0 ) || pos > text.length){
                println("ERROR")
            }
            else{
                println(text.get(pos-1)) //imprimimos la letra de posicion interior
            }

    if (text.length <(pos + 2)){
        println("ERROR")// uno
    }
    else{
        println(text.get(pos+1)) // imprimimos la letra de posicion siguientejughjgh
    }
}