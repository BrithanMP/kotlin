package `23_constructor_de_la_clase`

class rectangulo(var base: Int, var altura: Int) {

    constructor() : this(0, 0) {
        print("ingrese la base del rectandulo")
        base = readln().toInt()
        print("ingrese la altura del rectangulo")
        altura = readln().toInt()
    }

    init {
        if (base < 0)
            base = 1

        if (altura < 0)
            base = 1
    }

    fun area(): Int{
        return  base * altura
    }

    fun esCuadrado(): String{
        return if (base == altura)
            "es un cuadrado"
        else "es un rectangulo común"
    }
}

fun main(){
    val rectangulo1 = rectangulo(6,6 )
    rectangulo1.area()
    rectangulo1.esCuadrado()
}