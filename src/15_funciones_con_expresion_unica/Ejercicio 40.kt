package `15_funciones_con_expresion_unica`

fun retornMayor(v1: Int, v2: Int) = if (v1 > v2) v1 else v2

fun main (){
    print("ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    println("El mayor entre $valor1 y $valor2 es" + "${retornMayor(valor1, valor2)}")
}