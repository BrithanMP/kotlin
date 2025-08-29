package `27_POO_DAta_class`

data class Circulo2(val x: Int, val y: Int, val radio: Int)


fun main(){
    val circulo2 = Circulo2(10, 3, 30)
    val centrox = circulo2.component1()
    val cenrtoy = circulo2.component2()
    val radio = circulo2.component3()
    println("$centrox, $cenrtoy, $radio")
}
