package `15_funciones_con_expresion_unica`

fun convertirCastelano(valor: Int) = when (valor) {
    1 -> "uno"
    2 -> "dos"
    3 -> "tres"
    4 -> "cuatro"
    5 -> "cinco"
    else -> "error"

}

fun main (){
    for (i in 1..6)
        println(convertirCastelano(i))
}