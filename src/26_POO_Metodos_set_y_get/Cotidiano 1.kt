package `26_POO_Metodos_set_y_get`

import java.util.*

class Jardin() {
    private val Criollo: Int = 1000
    private val Americano: Int = 1500
    private val cintetico: Int = 2000

    var largo: Double = 0.0
        set(valor) {
            if (valor >= 0.0)
                field = valor
            else
                field = 1.0
        }

    //______________________________________________________________

    var ancho: Double = 0.0
        set(valor) {
            if (valor >= 0.0)
                field = valor
            else
                field = 1.0
        }

    //______________________________________________________________

    var tipozacate: Int = 0
        set(valor) {
            when {
                valor == 1 -> field = Criollo
                valor == 2 -> field = Americano
                valor == 3 -> field = cintetico
                else -> field == Criollo
            }
        }

    //______________________________________________________________

    private val nombreZacate: String
        get() = when (tipozacate) {
            1 -> "CRIOLLO"
            2 -> "AMERICANO"
            3 -> "SINTÉTICO"
            else -> "CRIOLLO"
        }

    //______________________________________________________________

    private var area: Double = 0.0
        get() = largo * ancho



    private var ManoObra: Double = 0.0
        get()= 500 * area


    //______________________________________________________________

    private var enzacatado: Double = 0.0
        get()= area * tipozacate


    private var SubTotal: Double = 0.0
        get()= enzacatado + ManoObra

    //______________________________________________________________

    private var ImpuestoVentas: Double = 0.0
        get() = SubTotal * 0.13


    //______________________________________________________________

    private var TotalPagar: Double = 0.0
        get()= SubTotal + ImpuestoVentas



    //______________________________________________________________

    fun ImprimirDetalle(){
        println("Largo del Jardin: $largo y ancho: $ancho")
        println("Area total $area")
        println("Tipo de Zacate selecciónado: $nombreZacate")
        println("Mano de obra: $ManoObra")
        println("Costo del zacate: $enzacatado")
        println("Subtotal: $SubTotal")
        println("Impuesto: $ImpuestoVentas")
        println("Total a pagar $TotalPagar")
    }


}

   //______________________________________________________________

fun main(){
    val Jardin1 = Jardin()
    Jardin1.tipozacate = 3
    Jardin1.ancho = 80.0
    Jardin1.largo = 50.0
    Jardin1.ImprimirDetalle()
}
