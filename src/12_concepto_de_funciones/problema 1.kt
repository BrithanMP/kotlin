package `12_concepto_de_funciones`

fun ingreso(){
    print("ingrse un nùmero")
    val num = readln().toInt()
    val respuesta = num * num
    println("el cuadrado de $num es $respuesta")
}

fun mult(){
    print("ingrese un valor")
    val num1 = readln().toInt()
    print("ingrese un segundo valor")
    val num2 = readln().toInt()
    val mul = num1 * num2
    println("la multiplicacion de los valores es $mul")
}

fun main(){
    ingreso()
    mult()
}