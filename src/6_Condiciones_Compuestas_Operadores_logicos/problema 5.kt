package `6_Condiciones_Compuestas_Operadores_logicos`

/* Escribir un programa en el cual: dada una lista de tres valores enteros ingresados por teclado se guarde en otras dos variables el menor y
 el mayor de esa lista. Utilizar el if como expresión para obtener el mayor y el menor.
 */
fun main(){
    print("Ingrese primer valor:")
      val num1 = readln().toInt()
    print("Ingrese segundo valor:")
    val num2 = readln().toInt()
    print("Ingrese tercer valor:")
    val num3 = readln().toInt()
    val mayor = if (num1 > num2 && num1 > num3) num1 else if (num2 > num3) num2 else num3
    val menor = if (num1 < num2 && num1 < num3) num1 else if (num2 < num3) num2 else num3
    println("El mayor es: $mayor")
    println("El menor es: $menor")
}
