package `6_Condiciones_Compuestas_Operadores_logicos`

/*Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10,
 imprimir en pantalla la leyenda "Alguno de los números es menor a diez"
 */

fun main(){
    print("ingrese primer valor")
    val num1: Int = readln(). toInt()
    print("ingrese segundo valor")
    val num2: Int = readln(). toInt()
    print("ingrese tercer valor")
    val num3: Int = readln(). toInt()
    if (num1 <10 || num3 < 10 || num2 < 10)
        print("alguno de los valores es menor a 10")
}