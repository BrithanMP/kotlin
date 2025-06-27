package `20_Funciones_tipo_arreglo`

fun carga(): IntArray {
    print("Cuantos elementos quiere cargar?")
    val cantidad = readln().toInt()
    val elementos = IntArray(cantidad)
    for(i in elementos.indices) {
        print("ingrese elemento")
        elementos[i] = readln().toInt()
    }
    return elementos
}

fun imprimir3(elementos: IntArray){
    println("Lista de todos los elementos")
    var sumElementos = 0
    for(elemento in elementos) {
        sumElementos += elemento
    }
}

fun main(){
    val sum = carga()
    imprimir3(sum)
}