package `14_funciones_con_retorno`

fun retornarSuperficiee(base: Int, altura: Int): Int {
    return (base * altura)/3
}

fun main() {
    println("ingrese la medida de un lado")
    val base = readln().toInt()
    println("ingrese la medida de un lado")
    val altura = readln().toInt()
    val superficie = retornarSuperficiee(base, altura)
    println("la superficie del rectangulo es $superficie")
}