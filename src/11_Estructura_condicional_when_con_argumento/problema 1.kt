package `11_Estructura_condicional_when_con_argumento`

fun main(){
    var con0 = 0
    var con1 = 0
    var con2 = 0
    var conmàs = 0
    for(i in 1..10){
        print("ingrese cuantos hijos tiene la familia $i: ")
        val hijos = readln().toInt()
        when(hijos){
            0 -> con0++
            1 -> con1++
            2 -> con2++
            else -> conmàs++
        }
    }
    println("cantidad de familias con 0 hijos:  $con0")
    println("camtidad de familias con 1 hijo:  $con1")
    println("cantidad de familias con 2 hijos:  $con2")
    println("cantidad de familias con màs de 2 hijos:  $conmàs")
}