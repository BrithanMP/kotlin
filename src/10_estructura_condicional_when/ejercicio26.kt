package `10_estructura_condicional_when`

fun main(){
    print("ingrese coordenada x del punto")
    val x = readln().toInt()
    print("ingrese coordenada y del punto")
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y > 0 -> println("segundo cuadrante")
        x < 0 && y < 0 -> println("tercer cuadrante")
        x > 0 && y < 0 -> println("cuarto cuadrante")
        else -> println("el punto se encuentra en un eje")
    }
}