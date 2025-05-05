package `9_estructura_repetitiva_for`

fun main(){
    var suma = 0
    for(i in 1..10){
        print("ingrese un valor")
        val valor = readln().toInt()
        suma += valor
    }
    println("la suma de los valores ingresados es $suma")
    val promedio = suma / 10
    println("el promedio seria de $promedio")
}