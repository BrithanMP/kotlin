package `16_Funciones_parametro_por_defecto`

/*Confeccionar una función que reciba entre 2 y 5 enteros.
La misma nos debe retornar la suma de dichos valores.
Debe tener tres parámetros por defecto.
 */

fun sumar(a: Int, b: Int, c: Int = 0, d: Int = 0, e: Int = 0
): Int {
    return a + b + c + d + e
}


fun main() {
    println(sumar(2, 3))
    println(sumar(1, 2, 3))
    println(sumar(4, 5, 6, 7))
    println(sumar(1, 1, 1, 1, 1))
}