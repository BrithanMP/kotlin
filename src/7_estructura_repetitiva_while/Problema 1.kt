package `7_estructura_repetitiva_while`

/* Escribir un programa que solicite ingresar 10 notas de alumnos y
nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */

fun main() {
    print("ingrese una nota del alumno")
    val n = readln(). toInt()
    var x = 1
    var cantidad = 0
    while (x <= n) {
        print("ingrese la nota")
        val nota = readln(). toDouble()
        if (nota >= 7)
            cantidad = cantidad + 1
        x = x + 1
    }
        print("las notas correctas son $cantidad")

}