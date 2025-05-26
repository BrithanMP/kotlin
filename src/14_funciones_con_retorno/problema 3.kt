package `14_funciones_con_retorno`

fun retornarSuperficie (lado1: Int, lado2: Int): Int {
    return lado1 * lado2
}

fun main() {
    println("Ingrese primer lado del primer triangulo")
    var lado1 = readln().toInt()
    println("Ingrese segundo lado del primer triangulo")
    var lado2 = readln().toInt()
    println("Ingrese primer lado del segundo triangulo")
    var lado3 = readln().toInt()
    println("Ingrese segundo lado del segundo triangulo")
    var lado4 = readln().toInt()

    val superficie1 = retornarSuperficie(lado1, lado2)
    val superficie2 = retornarSuperficie(lado3, lado4)

    if (superficie1 > superficie2) {
        println("El primer rectángulo tiene mayor superficie: $superficie1")
    } else if (superficie2 > superficie1) {
        println("El segundo rectángulo tiene mayor superficie: $superficie2")
    } else {
        println("Ambos rectángulos tienen la misma superficie: $superficie1")
    }
}