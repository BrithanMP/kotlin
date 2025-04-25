package `7_estructura_repetitiva_while`

fun main(){
    print("igrese cuantas piezas procesara")
    val n = readln(). toInt()
    var x = 1
    var cantidad = 0 // variable contadora
    while (x <= n) {
        print("ingrese la medida de le pieza")
        val largo = readln() . toDouble()
        if (largo >=1.20 && largo <= 1.30)
            cantidad = cantidad + 1
        x = x + 1;
    }
    print("la cantidad de piezas aptas son $cantidad")
}