package `20_Funciones_tipo_arreglo`

fun cargar(): IntArray {
    print("Cuantos sueldos quiere cargar?")
    val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for(i in sueldos.indices){
        print("ingrese elemento")
        sueldos[i] = readln().toInt()
    }
    return sueldos
}

fun imprimir2(sueldos: IntArray){
    println("Lista de todos los sueldos")
    for(sueldo in sueldos)
        println("sueldo")
}

fun main(){
    val sueldos = cargar()
    imprimir2(sueldos)
}