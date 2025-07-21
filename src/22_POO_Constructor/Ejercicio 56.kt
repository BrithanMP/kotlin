package `22_POO_Constructor`

class Persona2 (var nombre: String,var edad: Int){


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
    val Persona1 = Persona2("juan",17)
    Persona1.imprimir()
    Persona1.esMayorEdad()
}