package `9_estructura_repetitiva_for`

/*Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
 */

fun main(){
    for(i in 1..10) {
        val resul = 5 * i
        println("5 por $i es $resul")
    }
}