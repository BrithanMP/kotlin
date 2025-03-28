package `2_Entrada_de_datos`

/*
Escribir un programa en el cual se ingresan cuatro números enteros,
calcular e informar la suma de los dos primeros y el producto del tercero
y el cuarto.
*/
fun main () {
    print("ingrese el primer valor:")
     val valor1: Int = readln().toInt()
    print("ingrese el segundo valor:")
    val valor2: Int = readln().toInt()
    print("ingrese el tercer valor:")
    val valor3: Int = readln().toInt()
    print("ingrese el cuarto valor:")
    val valor4: Int = readln().toInt()
    val suma: Int = valor1 + valor2
    println("la suma de $valor1 y $valor2 es $suma")
    val producto = valor3 * valor4
    println("El producto de $valor3 y $valor4 es $producto")
}