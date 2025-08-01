package `23_POO_Metodos`

class NOtas {
    var nota1: Int = 0
    var nota2: Int = 0
    var nota3: Int = 0
    var nota4: Int = 0

    fun cargarNotas(){
        print("ingrese ingrese primera nota: ")
        nota1 = readln().toInt()
        print("ingrese ingrese segunda nota: ")
        nota2 = readln().toInt()
        print("ingrese ingrese tercera nota: ")
        nota3 = readln().toInt()
        print("ingrese ingrese cuarta nota: ")
        nota4 = readln().toInt()
        promedioNotas()
        aprobados()
    }

    fun promedioNotas(){
        var promedio = 0
        promedio = (nota1 + nota2 + nota3 + nota4) / 4
        println("el promedio de las anteriores notas ingresadas es $promedio")
    }

    fun aprobados(){
        var aprobado = 0
       if (nota1 > 70)
           aprobado++
        if (nota2 > 70)
            aprobado++
        if (nota3 > 70)
            aprobado++
        if (nota4 > 70)
            aprobado++

        println("la cantidad de aprobados son: $aprobado")
    }
}

fun main(){
    val NOtas1 = NOtas()
    NOtas1.cargarNotas()
}