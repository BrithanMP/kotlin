package `17_Funciones_argumentos_nombrados`

class `Ejercicio 44` {
}

fun calcularSueldo(nombre: String, costoHora: Double, cantidadhoras: Int){
    val sueldo = costoHora * cantidadhoras
    println("$nombre trabajo, $cantidadhoras horas, se le paga por hora $costoHora," +
            " por lo tanto le corresponde un sueldo de $sueldo")
}

fun main(){
    calcularSueldo("Juan", 10.5, 120)
    calcularSueldo(costoHora = 12.0, cantidadhoras = 40, nombre = "ana")
    calcularSueldo(cantidadhoras = 90, nombre = "Luis", costoHora = 7.25)
}