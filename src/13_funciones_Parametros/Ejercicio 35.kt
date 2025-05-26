package `13_funciones_Parametros`

fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    println("mayor")
    if(v1 > v2 && v1 > v3)
        println(v1)
    else
        if(v2 > v3)
            println(v2)
    else
        println(v3)
}

fun main(){
    print("ingrese primer valor")
    val val1 = readln().toInt()
    print("ingrese segundo valor")
    val val2 = readln().toInt()
    print("ingrese tercer valor")
    val val3 = readln().toInt()
    mostrarMayor(val1, val2, val3)
}