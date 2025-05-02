package `8_Estructura_repetitiva_doWhile`

/*Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor,
indica que ha finalizado la carga). Imprimir el valor acumulado e informar si dicho valor es cero,
mayor a cero o menor a cero.
 */

fun main(){
 var acumulado = 0
 var nùmero = 0
 do{
     print("ingrese un nùmero (9999 para terminar")
     nùmero = readln(). toInt()
     if (nùmero !=9999) {
         acumulado += nùmero
     }
 }   while (nùmero != 9999)
 println("numero acumulado: $acumulado")
    if (acumulado == 0){
        println("el valor acumulado es cero")
    }else if (acumulado > 0) {
        println("el valor acumulado es mayor a cero")
    }else {
        println("el valor del acumulado es $acumulado")
    }
    }