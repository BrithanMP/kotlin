package `12_concepto_de_funciones`

fun cargarSuma(){
    print("ingrese primer valor")
    val valor1 = readln().toInt()
    print("ingrese segundo valor")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los dos valores es $suma")
}

fun separacion(){
    println("*************************")
}

fun main(){
    for (i in 1..10){
        cargarSuma()
        separacion()
    }
}