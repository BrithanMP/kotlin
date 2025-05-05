package `9_estructura_repetitiva_for`

/*Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:

a) De cada triángulo la medida de su base, su altura y su superficie (la superficie se calcula multiplicando la base por la altura y dividiendo por dos).
b) La cantidad de triángulos cuya superficie es mayor a 12.
 */

fun main(){
    var cantidad = 0
    println("cuantas bases quiere ingresar?")
    val canbase = readln().toInt()
    for(i in 1..canbase){
        print("ingrese la base")
        val base = readln().toDouble()
        print("ingrese la altura")
        val altura = readln().toDouble()
        val superficie = base * altura / 2
        if(superficie > 12){
            cantidad++
        }
    }
    print("la cantidad de triangulos con superficie superior a 12 es $cantidad")
}
