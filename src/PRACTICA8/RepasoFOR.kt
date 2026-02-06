package PRACTICA8

fun main(){
    println("=========BUCLE FOR=======")

    for( i in 1..7){
        println("TE QUIERO $i <3")
    }

    //TAMBIEN SE PUEDE CON UN A LINEA SIN LLAVES ,OSEA UN LAMBDA

    for (i in 1..5) println("Contando $i")

    println("==========RANGO CON VARIACIONES===========")

    for (c in 'a'..'f') print(c)
    println(" ")// abcdef

    for (c in 'a'..'f' step 2) print(c)
    println(" ")// ace

    for (c in 'f' downTo 'a') print(c) // fedcba
    println(" ")

    for (c in 'a' until 'f') print(c)   // abcde
    println(" ")

    println("===================RECORRER UN ARRAY==============")

    val champions = arrayOf("Teemo", "Ahri", "Vayne", "Brand", "Kindred")

    for(i in champions.indices){
        println("${i + 1} - ${champions[i]}")
    }


    println("===========WITH INDEX===========")

    for((i,v) in  champions.withIndex()){
        println("[${i+1},$v]")
    }

    println("================RECORRER EL STRING============")

    for (c in "RIKACHERO"){
        println(c)
    }


}