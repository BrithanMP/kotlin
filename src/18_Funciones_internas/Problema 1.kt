package `18_Funciones_internas`

fun calcularMayor() {
    fun mayor(num1: Int, num2: Int): Int {
        return if (num1 > num2) num1 else num2
    }
    for (f in 1..5) {
        print("Ingrese valor 1: ")
        val num1 = readln().toInt()
        print("Ingrese valor 2: ")
        val num2 = readln().toInt()
        println("El mayor es: ${mayor(num1, num2)}\n")
    }
}
fun main() {
    calcularMayor()
}