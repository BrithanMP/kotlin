package `22_POO_Constructor3`

class Persona (var nombre: String,var edad: Int){

    init {
        if (edad < 0)
            edad = 0
    }

    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }
    fun esMayorEdad(){
        if (edad >= 18)
            println("es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main(){
    val Persona1 = Persona("juan",17)
    Persona1.imprimir()
    Persona1.esMayorEdad()
}