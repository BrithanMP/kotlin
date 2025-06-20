package Proyecto

fun registrarNota(nombre: String): Int {
    var nota: Int
    do {
        print("ingrese la noda de $nombre (tiene que ser de 0-100")
        nota = readln().toInt()
    }while (nota < 0 || nota > 100 )
    return nota
}
fun main(){
    val nombre = arrayOf("caleb","lawrence","Julian","randal", "Joel")
    val notas = Array(nombre.size){ i -> registrarNota(nombre[i]) }
    var na = 0
    var nb = 0
    var aprobado = 0
    var reprobado = 0
    var sumnotas = 0
    for (nota in notas) {
        sumnotas += nota
        if (nota >= 70)
            aprobado++
        else
            reprobado++
        if (nota > na)
            na = nota
        if (nota <= nb)
            nb = nota
        when (nota) {
            in 90..100 -> println("estudiante: Excelente")
            in 80.. 89-> println("estudiante: Buena")
            in 70.. 79-> println("estudiante: Aprobada")
            else -> println("estudiante: Reprobada")
        }
    }
    val promedio = sumnotas / 5
    println("Nota más alta: $na")
    println("Nota más baja: $nb")
    println("Estudiantes aprobado:$aprobado")
    println("Estudiantes reprobados: $reprobado")
    println("Promedio general de notas: $promedio")
}