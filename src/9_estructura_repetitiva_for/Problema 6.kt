package `9_estructura_repetitiva_for`
/*
Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante.
Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.

 */
fun main() {
    print("Ingrese la cantidad de puntos a procesar: ")
    val cantidad = readLine()!!.toInt()
    var cuadrante1 = 0
    var cuadrante2 = 0
    var cuadrante3 = 0
    var cuadrante4 = 0
    for (i in 1..cantidad) {
        print("Ingrese la coordenada x del punto $i: ")
        val x = readLine()!!.toInt()
        print("Ingrese la coordenada y del punto $i: ")
        val y = readLine()!!.toInt()
        if (x > 0 && y > 0)
            cuadrante1++
        else if (x < 0 && y > 0)
            cuadrante2++
        else if (x < 0 && y < 0)
            cuadrante3++
        else if (x > 0 && y < 0)
            cuadrante4++
    }
    println("Cantidad de puntos en el primer cuadrante: $cuadrante1")
    println("Cantidad de puntos en el segundo cuadrante: $cuadrante2")
    println("Cantidad de puntos en el tercer cuadrante: $cuadrante3")
    println("Cantidad de puntos en el cuarto cuadrante: $cuadrante4")
}