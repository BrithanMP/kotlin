package `18_Funciones_internas`

fun muntiplos2y5() {
    fun multipli(numero: Int, valor: Int) =
        numero % valor == 0

    var mult2 = 0
    var mult5 = 0
    for (i in 1..10) {
        print("Ingrese valor:")
        val valor = readln().toInt()
        if (multipli(valor, 2))
            mult2++
        if (multipli(valor, 5))
            mult5++
    }
    println("cantidad de multipos de 5 $mult5")
    println("cantidad de multipos de 2 $mult2")
}
