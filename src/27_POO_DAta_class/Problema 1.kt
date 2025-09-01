package `27_POO_DAta_class`

import kotlin.random.Random

data class Butaca(var numero: Int, var ocupada: Boolean) {
    override fun toString(): String {
        val estado = if (ocupada) "(ocupada)" else "(libre)"
        return "Butaca $numero $estado"
    }
} 


fun main() {
    
    val butacas = mutableListOf(
        Butaca(1, false),
        Butaca(2, false),
        Butaca(3, false),
        Butaca(4, false),
        Butaca(5, false)
    )


    var copiaAntesVenta = mutableListOf<Butaca>()
    for (i in butacas) {
        copiaAntesVenta += Butaca(i.numero, i.ocupada)
    }


    var vendida1 = Random.nextInt(1, 6)
    var vendida2 = Random.nextInt(1, 6)
    while (vendida2 == vendida1) {
        vendida2 = Random.nextInt(1, 6)
    }


    for (butaca in butacas) {
        if (butaca.numero == vendida1 || butaca.numero == vendida2) {
            butaca.ocupada = true
        }
    }

    println("Utilizando el toString():")
    println(butacas)

    println("el indi" + "vidual:")
    for ((numero, ocupada) in butacas) {
        val estado = if (ocupada) "ocupada" else "libre"
        println("Butaca $numero → $estado")
    }

    println("\nComparación de listas:")
    println("Contenido igual: ${butacas == copiaAntesVenta}")
    println("Misma referencia: ${butacas == copiaAntesVenta}")
    
}
