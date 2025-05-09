package `10_estructura_condicional_when`
/* Se ingresa por teclado un valor entero, mostrar una leyenda
por pantalla que indique si el número es positivo, nulo o negativo.
 */

fun main(){
    print("ingrese un nùmero: ")
    val num = readln().toInt()
    when{
        num > 0 -> println("su nùmero es positivo")
        num == 0 -> println("su nùmero es nulo")
        else -> println("su nùmero es negativo")
    }
}