package `10_estructura_condicional_when`

/* Plantear una estructura que se repita 5 veces y
dentro de la misma cargar 3 valores enteros.
Acumular solo el mayor del cada lista de tres valores
 */

fun main() {
    var acumulado = 0
    for (i in 1..5) {
        print("ingrese el primer nùmnero")
        val num1 = readln().toInt()
        print("ingrese el segundo nùmnero")
        val num2 = readln().toInt()
        print("ingrese el tercer nùmnero")
        val num3 = readln().toInt()
        val mayor = when {
            num1 >= num2 && num1 >= num3 -> num1
            num2 >= num1 && num2 >= num3 -> num2
            else -> num3
        }
        acumulado += mayor
    }
    println("el total de la suma de los mayores es $acumulado")
}