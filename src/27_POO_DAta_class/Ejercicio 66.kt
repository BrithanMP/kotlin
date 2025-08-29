package `27_POO_DAta_class`

data class Articulo(var codigo: Int, var descripcion: String, var precio: Float)


fun main(){
    val articulo1 = Articulo(1, "papas", 43f)
    val articulo2 = Articulo(2, "tomate", 32f)


    println(articulo1)
    println(articulo2)

    val puntero = articulo1
    puntero.precio = 100f
    println(articulo1)

    var articulo3 = articulo1.copy()

    articulo1.precio = 200f
    println(articulo1)

    println(articulo3)

    if (articulo1 == articulo3)
        println("son iguales $articulo1 y $articulo3")
    else
        println("son distintos $articulo3 y $articulo1")

    articulo3.precio = 200f

    if (articulo1 == articulo3)
        println("son iguales $articulo1 y $articulo3")
    else
        println("son distintos $articulo3 y $articulo1")

}

