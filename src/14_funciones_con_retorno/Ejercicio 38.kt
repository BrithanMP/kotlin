package `14_funciones_con_retorno`

fun rettornarmayor(v1: Int, v2: Int): Int {
    if (v1 > v2)
        return v1
    else
        return v1
}

fun main(){
    print("ingrese el primer valor")
    val valor = readln().toInt()
    print("ingrese el segundo valor")
    val valor2 = readln().toInt()
    println("el mayor entre $valor y $valor2 es ${rettornarmayor(valor, valor2)}")
}