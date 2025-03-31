package `4_estructura_condiciola_como_una_expresion`

/*
Solicita al usuario ingresar dos números enteros (pueden ser negativos).
Luego, determina cuál de los dos tiene mayor valor absoluto y
 muestra ese número en pantalla.
 */
fun main() {
    print("ingresar un valor entero: ")
    val valor1 = readln().toInt()
    print("ingresar un segundo valor: ")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("el mayor entre $valor1 y $valor2 es $mayor")
}