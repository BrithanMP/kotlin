package `14_funciones_con_retorno`

fun promedio(a: Int, b: Int, c: Int): Double {
    return (a + b + c) / 3.0
}

fun main() {
    val resultado = promedio(4, 8, 10)
    println("El promedio es: $resultado")
}