package PRACTICA9
/**Práctica 9:
Escribe un programa en Kotlin que:
1.- Define 2 arrays de números enteros(1, 2, 3, 4) y (5, 6, 7, 8)
2.- Recorra la primera matriz con un bucle externo y la segunda con un bucle interno, de manera que se
generen todas las combinaciones posibles de elementos entre ambas.
3.- Para cada par de números obtenidos, calcule su suma.
4.- Si la suma es mayor que 10, el programa debe saltar directamente a la siguiente iteración del bucle externo,
utilizando una etiqueta de bucle (continue@nombreEtiqueta).
5.- En caso contrario, debe mostrar en pantalla el par de números junto con su suma.
6.- El programa debe imprimir el seguimiento de las iteraciones, indicando qué valor se está evaluando en el
bucle externo y qué pares cumplen la condición.
* */
fun main(){
    val arr1 = arrayOf<Int>(1, 2, 3, 4)

    val arr2 = arrayOf<Int>(5, 6, 7, 8)

    // Etiquetamos el bucle externo para poder referenciarlo si es necesario
    bucleExterno@ for (num1 in arr1) {
        // Imprimimos el número de la primera matriz en cada iteración del bucle externo
        println("Iteración de bucle externo: num1 = $num1")

        for (num2 in arr2) {
            val suma = num1 + num2

            // Si la suma es menor o igual a 10, continuamos con la siguiente iteración del bucle externo
            if (suma > 10) {
                // continue@bucleExterno salta el resto del código dentro del bucle más interno
                // y pasa directamente a la siguiente iteración del bucle externo 'bucleExterno'
                println("Suma ($suma) > 10, saltando al siguiente num1...")
                continue@bucleExterno
            }

            // Si no saltamos, imprimimos el par
            println("  Pares válidos: ($num1, $num2), Suma = $suma")
        }
    }




}