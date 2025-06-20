package Practica_examen

fun funcionNota(nombre:String): Int{
    var nota: Int
    do {
        print("ingrese la nota de $nombre : ")
        nota = readln().toInt()
    }while (nota < 0 || nota > 100)
    return nota
}

fun main() {
    val nombre = arrayOf("Michael", "Caleb", "Sura", "Lara", "Dilan")
    var notas = Array(nombre.size) { i -> funcionNota(nombre[i]) }
    var Na = 0 //Significa nota más alta
    var Nb = 100 //significa nota más baja
    var aprobado = 0
    var reprobado = 0
    var sumnotas = 0
    for (nota in notas){
        sumnotas += nota
        if (nota > 70)
            aprobado++
        else
            reprobado++
        if (nota > Na)
            Na++
        if (nota <= Nb)
            Nb++
        when (nota){ //Definir aprobados, reprobados, notas buenas o excelentes
            in 100..90 -> println("Excelente")
            in 89..80 -> println("Buena")
            in 70..70 -> println("Aprobado")
            else -> println("Reprobado")
        }
    }
    val promedio = sumnotas / 5
    println("Nota más baja $Nb") a $Na")
    println("Cantidad de aprobados $aprobado")
    println("cantidad de reprobados $reprobado")
    println("promedio de las notas $promedio")
}