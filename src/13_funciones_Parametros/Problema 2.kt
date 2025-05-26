package `13_funciones_Parametros`

fun ordenarMayorMenor (a: Int, b: Int, c: Int){
    if (a >= b && a >= c) {
        if (b >= c) {
            println("$a, $b, $c")
        } else {
            println("$a, $c, $b")
        }
    } else if (b >= a && b >= c) {
        if (a >= c) {
            println("$b, $a, $c")
        } else {
            println("$b, $c, $a")
        }
    } else {
        if (a >= b) {
            println("$c, $a, $b")
        } else {
            println("$c, $b, $a")
        }
    }
}

fun main() {
    println("Introduce primer número:")
    val num1 = readln().toInt()
    println("Introduce segundo nùmero:")
    val num2 = readln().toInt()
    println("Introduce tercer nùmero:")
    val num3 = readln().toInt()
    ordenarMayorMenor(num1, num2, num3)
}
