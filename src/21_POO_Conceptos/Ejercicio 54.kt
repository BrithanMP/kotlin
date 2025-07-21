package `21_POO_Conceptos`

class Triangulo{
    var lado1: Int = 0
    var lado2: Int = 0
    var lado3: Int = 0

    fun Inicializar(){

    }

    fun ladoMayor(){
        print("lado Mayor")
        when{
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado1 && lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }
    fun esEquilatero(){
        if (lado1 == lado2 && lado1 == lado3)
            println("es un triangulo Equilatero")
        else
            println("No es un triangulo Equilatero")
    }
}

fun main(){
    val triangulo1 = Triangulo()
    triangulo1.Inicializar()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}