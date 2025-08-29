package `27_POO_DAta_class`

data class Persona(var nombre: String, var edad: Int){
    override fun toString(): String {
        return "$nombre, $edad"
    }
}

fun main(){
    var persona1 = Persona("Julian", 89)
    var persona2 = Persona ("Ana", 24)

    println(persona1)
    println(persona2)
}