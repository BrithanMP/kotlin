package `24_POO_Colaboracion_clases`

class Libro(var titulo: String, var prestado: Boolean) {

    fun prestar(){
        if (prestado) {
            prestado = true
            println("el libro $titulo esta prestado")
        }

        else
            println("el libro $titulo no puede ser prestado porque ya fué prestado")
    }

    fun devolver(){
        if (prestado) {
            prestado = false
            println("el libro $titulo esta disponible")
        }

        else
            println("el libro $titulo no es necesario devolverlo")
    }

    fun estado(){
        val prestado2 = if (prestado)
            "prestado"
        else "disponible"

        println("$titulo esta $prestado2")
    }
}

class Biblioteca {
    val Libro1: Libro = Libro("Don Quijote", true )
    val Libro2: Libro = Libro("Ana Frank", true )
    val Libro3: Libro = Libro("Elif", true )


    fun Operar(){
        Libro1.devolver()
        Libro2.prestar()
        Libro3.devolver()
    }

    fun RevisarEstado(){
        println("estado de cada libro:")
        Libro1.estado()
        Libro2.estado()
        Libro3.estado()
    }
}

fun main(){
    val Biblioteca1 = Biblioteca()
    Biblioteca1.Operar()
    Biblioteca1.RevisarEstado()
}