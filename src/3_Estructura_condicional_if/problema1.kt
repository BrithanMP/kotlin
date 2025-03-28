package `3_Estructura_condicional_if`

/*
Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
 */
fun main(){
    print ("ingrese la primera nota")
    val not1: Double = readln().toDouble()
    print("ingrese la segunda nota")
    val not2: Double = readln().toDouble()
    print("ingrese la tercera nota")
    val not3: Double = readln().toDouble()
    val suma = not1 + not2 + not3
    val division = suma / 3
    if (division >= 7){
        println("Promocionado")
    }
}