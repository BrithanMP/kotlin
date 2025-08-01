package `23_POO_Metodos`

class temperaturas {
    var temp1: Int = 0
    var temp2: Int = 0
    var temp3: Int = 0
    var temp4: Int = 0
    var temp5: Int = 0
    var temp6: Int = 0
    var temp7: Int = 0
    //temp = temperatura


    fun cargarDatos(){
        print("ingrese la primera temperatura: ")
        temp1 = readln().toInt()
        print("ingrese la segunda temperatura: ")
        temp2 = readln().toInt()
        print("ingrese la tercera temperatura: ")
        temp3 = readln().toInt()
        print("ingrese la cuarta temperatura: ")
        temp4 = readln().toInt()
        print("ingrese la quinta temperatura: ")
        temp5 = readln().toInt()
        print("ingrese la sexta temperatura: ")
        temp6 = readln().toInt()
        print("ingrese la septima temperatura: ")
        temp7 = readln().toInt()

        mostrarMaximo()
        mostrarMinima()
    }
    fun mostrarMaximo() {
        var mayor = temp1
        if (temp2 > mayor) mayor = temp2
        if (temp3 > mayor) mayor = temp3
        if (temp4 > mayor) mayor = temp4
        if (temp5 > mayor) mayor = temp5
        if (temp6 > mayor) mayor = temp6
        if (temp7 > mayor) mayor = temp7
        when (mayor) {
            temp1 -> println("️Temperatura más alta: $mayor °C")
            temp2 -> println("Temperatura más alta: $mayor °C")
            temp3 -> println("Temperatura más alta: $mayor °C")
            temp4 -> println("Temperatura más alta: $mayor °C")
            temp5 -> println("Temperatura más alta: $mayor °C")
            temp6 -> println("Temperatura más alta: $mayor °C")
            temp7 -> println("Temperatura más alta: $mayor °C")
        }
    }
    fun mostrarMinima() {
        var menor = temp1
        if (temp2 < menor) menor = temp2
        if (temp3 < menor) menor = temp3
        if (temp4 < menor) menor = temp4
        if (temp5 < menor) menor = temp5
        if (temp6 < menor) menor = temp6
        if (temp7 < menor) menor = temp7
        when (menor) {
            temp1 -> println("Temperatura más baja: $menor °C")
            temp2 -> println("Temperatura más baja: $menor °C")
            temp3 -> println("Temperatura más baja: $menor °C")
            temp4 -> println("Temperatura más baja: $menor °C")
            temp5 -> println("Temperatura más baja: $menor °C")
            temp6 -> println("Temperatura más baja: $menor °C")
            temp7 -> println("Temperatura más baja: $menor °C")
        }
    }

}


fun main(){
    val temperaturas1 = temperaturas()
    temperaturas1.cargarDatos()
}