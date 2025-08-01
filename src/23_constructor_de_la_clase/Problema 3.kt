package `23_constructor_de_la_clase`

class rectangulo(var base: Int, var altura: Int) {

    init {
        if (base < 0)
            base = 1

        if (altura < 0)
            base = 1
    }

    fun area(){
        var area = 0
        area = base * altura
        println("el area es de $area")
    }

    fun esCuadrado(){
        if (base == altura)
            println("es un cuadrado")
        else println("es un rectangulo común")
    }
}

fun main(){
    val rectangulo1 = rectangulo(9,6 )
    rectangulo1.area()
    rectangulo1.esCuadrado()
}