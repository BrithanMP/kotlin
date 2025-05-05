package `9_estructura_repetitiva_for`

fun main() {
    var aprobados = 0
    var reprobados = 0
    for (i in 1..10) {
        print("ingrese una nota")
        val nota = readln().toInt()
        if (nota >= 7)
            aprobados++
        else
            reprobados++
    }
    println("csntidad de alumnos aprobados $aprobados")
    println("cantidad de reprobados $reprobados")
}