package `24_POO_Colaboracion_clases`

class Estudiante (var nombre: String, var asistencias: Int) {

    fun registrarAsistencia(){

        if (asistencias == 0)
            asistencias = 0

        else asistencias = 1
    }
    fun imprimir(){
        println("el o la estudiante $nombre tiene una asistencia de $asistencias")
    }
}

class Clase {
    val est1: Estudiante = Estudiante("Julian", 1)
    val est2: Estudiante = Estudiante("Sara", 0)
    val est3: Estudiante = Estudiante("Lara", 1)

    fun MarcarAsistencia(){
        est1.registrarAsistencia()
        est2.registrarAsistencia()
        est3.registrarAsistencia()
    }
    fun reporte(){
        est1.imprimir()
        est2.imprimir()
        est3.imprimir()
    }
}

fun main(){
    val Clase1 = Clase()
    Clase1.MarcarAsistencia()
    Clase1.reporte()
}