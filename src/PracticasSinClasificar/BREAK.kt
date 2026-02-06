package PracticasSinClasificar

fun main(){
    val matrix = arrayOf(
        intArrayOf(1,1,1),
        intArrayOf(0,1,0),
        intArrayOf(1,1,0),
    )

    for (row in matrix.indices){
        for(col in matrix[row].indices){
            if(matrix[row][col]==0){
                println("MATRIX INVALIDA EN [$col,$row]")
                break
            }
        }
    }
}