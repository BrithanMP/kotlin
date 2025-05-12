package `11_Estructura_condicional_when_con_argumento`

fun main(){
    print("ingresar un valor entero positivo dompremdido entre 1 y 99999")
    val valor = readln().toInt()
    when(valor){
        in 1..9 -> print("tiene 1 digito")
        in 10..99 -> print("tiene 1 digito")
        in 100..999 -> print("tiene 1 digito")
        in 1000..9999 -> print("tiene 1 digito")
        in 10000..99999 -> print("tiene 1 digito")
        else -> print("el nùmero no se encuentra comprendido")
    }


}