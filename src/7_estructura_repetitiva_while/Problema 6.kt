package `7_estructura_repetitiva_while`
/*Desarrolla un programa que permita cargar dos listas de 5 valores numéricos cada una.
Primero, solicita al usuario que ingrese los 5 valores de la primera lista y acumule la suma de esos valores.
Luego, solicita al usuario que ingrese los 5 valoes de la segunda lista y acumule también su suma.
Al finalizar la carga de ambas listas, compara las sumas obtenidas:
Si la suma de la primera lista es mayor, muestra el mensaje "Lista 1 mayor."
Si la suma de la segunda lista es mayor, muestra el mensaje "Lista 2 mayor."
Si ambas sumas son iguales, muestra el mensaje "Listas iguales."
Recuerda que para resolver este problema deberás utilizar dos estructuras repetitivas (una para cada lista).

 */


fun main() {
    var x = 1
    var suma = 0
    var suma2 = 0
    while (x <= 5) {
        print("ingrese un valor")
        val valor = readln().toInt()
        suma = suma + valor
        x = x + 1
    }
    println("la suma de los 10 valores ingresados es $suma")
    while (x <= 5) {
        print("ingrese un valos para la segunda lista")
        val valor2 = readln().toInt()
        suma2 = suma + valor2
        x = x + 1
    }
    println("la suma de los 10 valores ingresados es $suma2")
}