package `13_funciones_Parametros`

fun MostrarPerimetro(lado: Int){
    val perimetro = lado * 4
    println("la superficie es $perimetro")
}

fun MostrarSuperficie(lado: Int) {
    val superficie = lado * lado
    println("la superficie es $superficie")
}

fun main(){
    print("ingrese el valor del lado de un cuadrado")
    val lado = readln().toInt()
    print("quiere calcular la superficie o el perimetrp [ingresar texto: perimetro/superficie]")
    var respuesta = readln()
    when (respuesta){
        "perimetro" -> MostrarPerimetro(lado)
        "superficie" -> MostrarSuperficie(lado)
    }
}