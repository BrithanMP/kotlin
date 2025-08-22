package `26_POO_Metodos_set_y_get`

import java.util.*

class Persona {
    var nombre: String = ""
        set(valor) {
            field = valor.uppercase(Locale.getDefault())
        }
        get() {
            return "(" + field + ")"
        }

    var edad: Int = 0
        set(valor) {
            if (valor >= 0)
                field = valor
            else
                field = 0
        }

}

    fun main(){
        val Persona1 = Persona()
        Persona1.nombre = "Michael"
        Persona1.edad = 78
        println(Persona1.nombre)
        println(Persona1.edad)
        Persona1.edad = -80
        println(Persona1.edad)
    }




