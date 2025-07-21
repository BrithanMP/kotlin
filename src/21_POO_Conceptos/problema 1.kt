package `21_POO_Conceptos`

class Alumno(){
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar(nombre: String, nota: Int) {
        this.nombre = nombre
        this.nota = nota
    }

    fun imprimir(){
        println("Nombre: $nombre y tiene una nota de $nota")
    }

    fun Aprov_Reprov(){
        if (nota >= 7)
            println("el estudiante aprobo - $nombre")
        else
            println("el estudiante reprobo - $nombre")
    }
}

fun main(){
   val alumno1: Alumno
    alumno1 = Alumno()
    alumno1.inicializar("michael", 10)
    alumno1.imprimir()
    alumno1.Aprov_Reprov()

    val alumno2: Alumno
    alumno2 = Alumno()
    alumno2.inicializar("sara", 5)
    alumno2.imprimir()
    alumno2.Aprov_Reprov()
}