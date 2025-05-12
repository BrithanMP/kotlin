package `12_concepto_de_funciones`

fun presentacion() {
    println("programa que permite ingresar 2 variables por teclado")
    println("efectuar la suma de los valores")
    println("muestre el resultado de la suma")
    println("********************************")
}

fun cargarSumas(){
    print("ingrese el primer valor")
    val valor1 = readln().toInt()
    print("ingrese segundo valor")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los 2 valores es $suma")
}

fun finalizacion(){
    println("*********************************")
    println("gracias por utilizar este programa")
}

fun main(){
    presentacion()
    cargarSumas()
    finalizacion()
}