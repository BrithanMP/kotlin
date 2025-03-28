package `3_Estructura_condicional_if`

/*
Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando
 si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 */
fun main(){
    print("ingrese un nùmero entre el 1 y el 99")
    val num = readln().toInt()
if (num <= 10) {
    print("el nùmero solo tiene un digito")
}else{
    print("el nùmero tiene 2 digitos")
}
}