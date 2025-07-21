package `22_POO_Constructor`

class Persona constructor(nombre: String, edad: Int){
    var nombre: String = nombre
    var edad: Int = edad


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