package `23_constructor_de_la_clase`

class producto (var nombre: String, var precio: Int, var stock: Int){

    init {
        if(precio < 0)
            precio = 0

        if (stock < 0)
            stock = 0
    }

    fun hayStock(){
        if(stock > 0)
            println("$nombre si esta disponible en stock y el precio es de $precio")
        else
            println("el producto no esta disponible")
    }

    fun mostrarInfo(){
        println("nombre del producto: $nombre")
        println("cantidad en stock: $stock")
        println("precio del producto: $precio")
    }
}

fun main(){
    val producto1 = producto("mouse", 7000, 6)
    producto1.hayStock()
    producto1.mostrarInfo()
}