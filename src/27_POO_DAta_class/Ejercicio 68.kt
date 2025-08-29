package `27_POO_DAta_class`

data class jugador(var nombre: String){
    var puntos: Int = 0
}

fun main(){
    val jugador1 = jugador("Juan")
    val jugador2 = jugador("juan")

    jugador1.puntos = 10
    jugador2.puntos = 20

    if (jugador1 == jugador2)
        println("Tienen el mismo nombre los jugadore")
    else
        println("no tienen el mismo nombre")
}