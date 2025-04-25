package `6_Condiciones_Compuestas_Operadores_logicos`

/*Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del número y mostrarlo.
 */
fun main(){
    print("ingrese primer valor")
    val num1: Int = readln(). toInt()
    print("ingrese segundo valor")
    val num2: Int = readln(). toInt()
    print("ingrese tercer valor")
    val num3: Int = readln(). toInt()
    val valorcubo = (num3 * num2 * num1)
    if (num1 == num2 || num3 == num2 || num1 == num3)
        print("el valor del cubo es $valorcubo")
    else
        ("no es un cubo")
}