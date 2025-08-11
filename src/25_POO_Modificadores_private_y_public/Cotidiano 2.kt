package `25_POO_Modificadores_private_y_public`

class sensorTemperatura(){
    private var temperatura: Double = 0.0

    fun configurarTemperatura(valor: Double){
        validarRango(valor)
    }

    private fun validarRango(valor: Double) {
        if (valor >= -50 || valor <= 150) {
            temperatura = valor
        } else {
            println("False")
        }
    }

    fun aumentar(delta: Double){
        validarRango(delta)
        temperatura += delta
    }

    fun disminuir(delta: Double){
        validarRango(delta)
        temperatura -= delta
    }

    fun mostrar(){
        temperatura = temperatura + 0.1
        println("la temperatura actual es de $temperatura")
    }
}

fun main() {
    val sensor = sensorTemperatura()
    sensor.configurarTemperatura(50.3)
    sensor.aumentar(20.0)
    sensor.disminuir(60.3)
    sensor.mostrar()
}

//no se cual error tengo : (