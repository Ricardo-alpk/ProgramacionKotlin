/*
* Práctica 3: Gestión de Notas
Crea un programa (fichero “practica3.kt”) que:
1. Crear un DoubleArray para 5 notas
2. Pedir al usuario que introduzca las 5 notas por teclado
3. Calcular la suma de todas las notas
4. Calcular el promedio
5. Encontrar la nota más alta
6. Mostrar resultados (notas introducidas, suma, promedio y máxima)
* */

package PRACTICA3

fun main(){

    val notas = DoubleArray(5)

    println("introduce 5 notas para avaluar a los alumnos")

    for(i in notas.indices){  // o en vez de esto podemos poner esto si queremos ejercutar el bucle x veces  for(i in 0 until 5)
        val nota = readLine() ?: "0"

        val notadou = nota.toDouble()

        notas[i] = notadou
    }

    for(i in notas.indices){
        println("La nota del alumno ${i +1} seria ${notas[i]}")
    }

    //val sumad = notas.sum()

    var sumad = 0.0

    for(nota in notas){
        sumad += nota // oxn este bucle sumamos todos los valores del double array
    }



    val promedio = (sumad / notas.size)

    println("El promedio de las notas es ${promedio}")

    //nota mas alta

    val notamasalta = notas.maxOrNull()

    println("LA NOTA MAS ALTA ES ${notamasalta}")


}