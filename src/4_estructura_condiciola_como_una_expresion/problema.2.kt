package `4_estructura_condiciola_como_una_expresion`

/*
Solicita al usuario que ingrese su edad.
Almacena una descripción en una variable usando una expresión if:

Si es menor de 13, asigna "Niño".
Si está entre 13 y 17 inclusive, asigna "Adolescente".
Si es 18 o más, asigna "Adulto".
Luego, imprime la descripción correspondiente.
 */

fun main(){
    print("ingrese su edad: ")
    val edad = readln().toInt()
    if (edad < 13){
        print("es un niño")
    }else if (edad > 13 && edad < 17) {
        print("es un adolecente")
    }else if ( edad > 18) {
        print("adulto")
    }
}
