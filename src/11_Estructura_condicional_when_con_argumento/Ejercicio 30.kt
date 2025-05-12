package `11_Estructura_condicional_when_con_argumento`

fun main(){
    print("ingrese un valor entre 1 y 5: ")
    val valor = readln().toInt()
    when(valor){
        1 -> print("uno")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("cuatro")
        5 -> print("cinco")
        else -> print("valor fuera de rango")
    }
}