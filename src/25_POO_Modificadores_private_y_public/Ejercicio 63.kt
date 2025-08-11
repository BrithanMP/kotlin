package `25_POO_Modificadores_private_y_public`

class Operaciones {
    private var valor1: Int = 0
    private var valor2: Int = 0

    fun cargar(){
        print("ingrese primer valor: ")
        valor1 = readln().toInt()
        print("ingrese segundo valor: ")
        valor2 = readln().toInt()
        suma()
        resta()
    }

    private fun suma() {
        var suma = valor1 * valor2
        println("la suma de $valor1 y $valor2 es $suma")
    }

    private fun resta() {
        var resta = valor1 - valor2
        println("la resta de $valor1 y $valor2 es $resta")
    }
}

fun main() {
   val operaciones1 = Operaciones()
    operaciones1.cargar()
}