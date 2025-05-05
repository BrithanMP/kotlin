package `9_estructura_repetitiva_for`

/*Desarrollar un programa que solicite la carga de 10 números
 e imprima la suma de los últimos 5 valores ingresados.
 */

fun main(){
    var num = 0
    var sum = 0
    println("ingrese 10 nùmeros")
    for (i in 1..10){
        print("nùmero $i: ")
        num = readln().toInt()
        if(i > 5) {
            sum += num
        }
    }
    println("la suma de los ultimos 5 nùmeros es $sum")
}