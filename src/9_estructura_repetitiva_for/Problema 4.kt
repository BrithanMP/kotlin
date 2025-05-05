package `9_estructura_repetitiva_for`

/*Confeccionar un programa que permita ingresar un valor del 1 al 10
y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
 */
fun main(){
    print("ingrese un nùmero del 1 al 10")
    val num = readln().toInt()
    for(i in 1..12){
        val resul= num * i
        println("$resul")
    }
}
