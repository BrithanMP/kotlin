package `20_Funciones_tipo_arreglo`

fun carg(elementos: IntArray): IntArray{
    for(i in elementos.indices) {
        print("ingrese elemento")
        elementos[i] = readln().toInt()
    }
    return elementos
}

fun imprimir4(elementos: IntArray): Int{
    var menor = elementos[0]
    for(i in 1..elementos.size) {
        if (elementos[i] < menor) {
            menor = elementos[i]
        }
    }
    return menor
}

fun contar(elementos: IntArray, valor: Int): Int{
    var contador = 0
    for (elemento in elementos) {
        if (elemento == valor){
            contador++
        }
    }
    return contador
}

fun main(){
    val elementos = IntArray(size = 5)
    carg(elementos)
    val menor = imprimir4(elementos)
    val repit = contar(elementos, menor)

    println("el menor es: $menor")
    if(repit > 1){
        println("el número menor se repite")
    } else {
        println("el menor no se repite")
    }

}
