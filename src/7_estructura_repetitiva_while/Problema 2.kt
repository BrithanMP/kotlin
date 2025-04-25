package `7_estructura_repetitiva_while`

/*Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa por teclado).
 Mostrar la altura promedio de las personas.
 */

fun main(){
    print("cuantas alturas quiere ingresar?")
    val n = readln(). toInt()
    var x = 1
    var cantidad = 0 // variable contadora
    while (x <= n) {
        print("ingrese la altura")
        val altura = readln() . toDouble()
        if (altura >=1.40 && altura <= 2.00)
            cantidad = cantidad + 1
        x = x + 1;
    }
    print("la altura promedio de las personas entre 1,40 y 2.00 es $cantidad")
}