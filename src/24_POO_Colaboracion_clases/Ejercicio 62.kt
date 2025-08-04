package `24_POO_Colaboracion_clases`

import `20_Funciones_tipo_arreglo`.imprimir
import kotlin.random.Random

class Dado(var valor: Int){

    fun tirar(){
        this.valor = ((Random.nextInt(1,6))).toInt()
        imprimir()
    }

    fun imprimir(){
        println("valor del dado: $valor")
    }
}

class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun Jugar () {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("ganador")
        else
            println("intente de nuevo")
    }

}

fun main(){
    val Juego1 = JuegoDeDados()
    Juego1.Jugar()
}