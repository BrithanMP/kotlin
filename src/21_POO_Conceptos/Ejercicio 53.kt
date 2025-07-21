package `21_POO_Conceptos`

class Persona{
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
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
    val Persona1: Persona
    Persona1 = Persona()
    Persona1.inicializar("michael", 12)
    Persona1.imprimir()
    Persona1.esMayorEdad()

    val Persona2: Persona
    Persona2 = Persona()
    Persona2.inicializar("sara", 25)
    Persona2.imprimir()
    Persona2.esMayorEdad()

}