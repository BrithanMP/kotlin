package `10_estructura_condicional_when`

fun main(){
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        print("ingrese el peso de la pieza (0 para finalizar")
        val peso = readln().toDouble()
        when {
            peso > 10.2 -> cant1++
            peso >= 9.8 -> cant2++
            peso > 0 -> cant3++
        }
    }while (peso != 0.0)
    println("piezas aptas: $cant2")
    println("piiezas con un pèso superior a 10.2: $cant1")
    println("piezas con un peso inferior a 9.8: $cant3")
    val suma = cant3+cant2+cant1
    println("cantidad de piezas procesadas: $suma")
}