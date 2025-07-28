package `23_constructor_de_la_clase`

class libro(var titulo: String, var autor: String, var cantidad_de_paginas: Int){

    constructor() : this("o", "o", 0){
        print("indique el titulo del libro: ")
         titulo = readln().toString()
        print("indique el autor del libro: ")
         autor = readln().toString()
        print("ingrese la cantidad de paginas: ")
         cantidad_de_paginas = readln().toInt()
    }

    fun Leer(paginasLeidas: Int){
        var quedanPorLeer = 0
        quedanPorLeer = cantidad_de_paginas - paginasLeidas
        println("le faltan por leer $quedanPorLeer paginas")
    }

    fun infoLibro(){
        println("titulo del libro: $titulo")
        println("autor del libro: $autor")
        println("cantidad de paginas: $cantidad_de_paginas")
    }
}

fun main(){
    val libro1 = libro()
    libro1.Leer(34)
    libro1.infoLibro()
}