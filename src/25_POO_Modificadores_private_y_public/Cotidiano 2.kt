package `25_POO_Modificadores_private_y_public`

class sensorTemperatura() {
    private var temperatura: Double = 0.0

    fun configurarTemperatura(valor: Double) {
        if (ValidarRango(valor)){
            temperatura = valor
        }else{
            println("syntax Error")
        }
    }

    private fun ValidarRango(valor: Double): Boolean {
       return valor in -50.0..150.0
    }

    fun Aumentar(delta: Double){
        val Tempsuma = temperatura + delta
        if (ValidarRango(Tempsuma)){
            temperatura = Tempsuma
        }else{
            println("error")
        }


    }

    fun Disminuir(delta: Double){
        val TempResta = temperatura - delta
        if (ValidarRango(delta)) {
            temperatura = TempResta
        }else{
            println("error")
        }
    }

    fun Mostrar(){
        println("temperatura $temperatura°")
        ValidarRango1(temperatura)
    }
    private fun ValidarRango1(valor: Double): Boolean {
        if (valor >= -50.0 && valor <= 150.0) {
            return true
        } else {
            return false
        }
    }
}


fun main(){
    val SensorTemperatura1 = sensorTemperatura()
    SensorTemperatura1.configurarTemperatura(10.0)
    SensorTemperatura1.Aumentar(90.8)
    SensorTemperatura1.Disminuir(50.8)
    SensorTemperatura1.Mostrar()
}
