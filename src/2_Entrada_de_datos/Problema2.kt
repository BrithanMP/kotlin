package `2_Entrada_de_datos`

/*
Realizar un programa que lea por teclado cuatro valores numéricos enteros
 e informe su suma y promedio.
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
    val suma: Int = valor1 + valor2 + valor3 + valor4
    println("la suma de los promedios $valor1, $valor2, $valor3 y $valor4 es $suma")
    val promedio = suma / 4
    println("El promedio de $suma es $promedio")
    }