package `23_POO_Metodos`

class Operaciones {
    var valor1: Int = 0
    var valor2: Int = 0

    fun cargar(){
        print("ingrese primer valor: ")
        valor1 = readln().toInt()
        print("ingrese segundo valor: ")
        valor2 = readln().toInt()
        sumar()
        restar()
    }

    fun sumar() {
        val suma = valor1 + valor2
        println("la suma de $valor1 y $valor2 es $suma")
    }

    fun restar() {
        val restar = valor1 - valor2
        println("la resta entre $valor1 y $valor2 es $restar")
    }
}

fun main(){
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}