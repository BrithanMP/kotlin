package `8_Estructura_repetitiva_doWhile`

fun main(){
    do{
        print("ingrese um vslor entre 0 y 999")
        val valor: Int = readln(). toInt()
        if (valor < 10)
            println("el valor ingresado tiene un digito")
        else
            if (valor <100)
                println("el valor tiene 2 digitos")
            else
                println("el valor tiene 3 digitos")
    }while (valor != 0)
}