package `10_estructura_condicional_when`
/* Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
isósceles (dos lados iguales), o escaleno (ningún lado igual)
 */


fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    println("cuantos triangulos quiere ingresar?")
    val tri = readln().toInt()
    for (i in 1..tri) {
        println("ingrese el primer lado")
        val lad1 = readln().toDouble()
        println("ingrese el segundo lado")
        val lad2 = readln().toDouble()
        println("ingrese el tercer lado")
        val lad3 = readln().toDouble()
        when {
            lad1 == lad2 && lad1 == lad3 -> {
                println(" es un triangulo equilatero")
                cant1++
            }
            lad1 == lad2  || lad1 == lad3  || lad2 == lad3 -> {
                println("es un triangulo isòceles")
                cant2++
            }
            else -> println("es un triangulo escaleno")
            }
        }
    println("equilateros $cant1")
    println("isòceles $cant2")
    println("escaleno $cant3")
}

