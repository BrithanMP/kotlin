package `13_funciones_Parametros`

fun mostrarMensaje(mensaje: String){
    println("***********************************************************")
    println(mensaje)
    println("*************************************")
}

fun cargaSuma(){
    print("ingrese el primer valor")
    val val1 = readln().toInt()
    print("ingrese el segundo valor")
    val val2 = readln().toInt()
    val suma = val2 + val1
    println("la suma de los valores es $suma")
}

fun main(){
    mostrarMensaje("El programa calcula la suma de 2 valores ingresados por teclado")
    cargaSuma()
    mostrarMensaje("gracias por usar este programa")
}