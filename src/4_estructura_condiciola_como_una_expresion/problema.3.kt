package `4_estructura_condiciola_como_una_expresion`
/*
Solicita al usuario que ingrese tres valores enteros positivos que representan los lados de un triángulo.
 Valida primero que puedan formar un triángulo (la suma de dos lados debe ser mayor al tercero).
Si es válido, guarda en una variable el tipo de triángulo usando una expresión if:
"Equilátero" si los tres lados son iguales.
"Isósceles" si dos lados son iguales.
"Escaleno" si todos los lados son distintos.
 Imprime el tipo de triángulo o un mensaje de error si no forman uno válido.
 */
fun main(){
    print("ingrese primer valor")
    val valor1 = readln().toInt()
    print("ingrese primer valor")
    val valor2 = readln().toInt()
    print("ingrese primer valor")
    val valor3 = readln().toInt()

    if (valor1 + valor2 > valor3) {
        print("si es un triangulo")

        val tipo_de_triagulo = if (valor1 == valor2 && valor1 == valor3 && valor2 == valor3) {
            "triangulo Equilátero"
        } else if (valor1 == valor3 && valor1 == valor3 && valor2 == valor3) {
            "triangulo isóceles"
        } else {
            "escaleno"
        }
        println("El triangulo es $tipo_de_triagulo")
    }else {
       println("los valores que ingreso no forman un triangulo")
    }
}

