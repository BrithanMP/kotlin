package `22_POO_Constructor4`

class Triangulo(var lado1: Int, var lado2: Int, var lado3: Int){

    constructor() : this(0,0,0){
        print("ingrese primer lado: ")
        lado1 = readln().toInt()
        print("ingrese segundo lado: ")
        lado2 = readln().toInt()
        print("ingrese tercer lado: ")
        lado3 = readln().toInt()
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
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()

    val triangulo2 = Triangulo(12, 45, 24)
    triangulo2.ladoMayor()
    triangulo2.esEquilatero()
}