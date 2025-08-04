package `24_POO_Colaboracion_clases`

class Motor{

    var encendido: Boolean = false

    fun encender(){
        if (encendido) {
            encendido = true
            println("El motor esta prendido, rum, rum")
        }
    }

    fun apagar(){
        if (encendido) {
            encendido = false
            println("El motor esta apagado, off")
        }
    }

    fun estado(){
        val encendido1 = if (encendido)
            "encendido"
        else "apagado"

        println("el motor esta  $encendido1")
    }
}

class Carro(){
    var motor = Motor()

    fun conducir(){
        if(motor.encendido){
            println("Puede avanzar")
        }
        else {
            println("el carro esta apagado")
        }
    }

    fun EstadoGeneral(){
        motor.estado()
    }
}

fun main(){
    val Carro1 = Carro()
    Carro1.motor.encender()
    Carro1.conducir()
    Carro1.EstadoGeneral()
    Carro1.motor.apagar()
}