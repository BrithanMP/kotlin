package `15_funciones_con_expresion_unica`

fun retornarSuperficie(lado:Int): Int = lado * lado

fun main (){
    print("Ingrese el primer valor del lado del cuadrado:")
    val lado = readln().toInt()
    println("La superficie del cuadrado" + "es ${ retornarSuperficie(lado) }")
}