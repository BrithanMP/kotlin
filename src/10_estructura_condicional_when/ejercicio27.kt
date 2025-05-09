package `10_estructura_condicional_when`

fun main(){
    print("ingrese primer nota")
    val nota1 = readln().toInt()
    print("ingrese segunda nota")
    val nota2 = readln().toInt()
    print("ingrese tercera nota")
    val nota3 = readln().toInt()
    val promedio = (nota2+nota3+nota1)/3
    when{
        promedio >= 7 -> println("avandazo")
        promedio >= 4 -> println("intermedio")
        else -> println("reprobado")
    }
}