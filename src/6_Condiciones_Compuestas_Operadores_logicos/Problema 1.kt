package `6_Condiciones_Compuestas_Operadores_logicos`

/*
Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.
 */

fun main(){
    print("ingrese una dia")
    val dia: Int = readln(). toInt()
    print("ingrese un mes")
    val mes: Int = readln(). toInt()
    if ( dia == 25 || mes == 12)
        print("esta fecha si es Navidad")
    else
        print("esta fecha no es navidad")
}