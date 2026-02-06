package PRACTICA8

fun main(){
    //Con esto detenemois un bucle ANTES de que termine

    while (true) {
        print("Escribe una palabra: ")
        val word = readLine()!!
        if (word == "salir"){
            break //importante perro
        }
        println("Caracteres: ${word.length}")
    }


    println("=============BUCLE DOBLE==============")

    val matrix = arrayOf(
        intArrayOf(1,1,1),
        intArrayOf(0,1,0),
        intArrayOf(1,1,0)
    )

    for(row in matrix.indices){
        for (col in matrix[row].indices){
            if (matrix[row][col]== 0){
                println("matriz ivalideishon en [$col, $row]")
                break
            }
        }
    }

    println("============bucles con etiquetas===================")

    Loop@ for (row in matrix.indices) {
        for (col in matrix[row].indices) {
            if (matrix[row][col] == 0) {
                println("Matriz inválida en [$col,$row]")
                break@Loop // rompe el bucle externo, por eso lo etiquetamos como en instagram
            }
        }
    }

}