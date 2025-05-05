package `9_estructura_repetitiva_for`

fun main() {
    var mult3 = 0
    var mult5 = 0
    var mult9 = 0
    for (i in 1..10000) {
        if (i % 3 == 0)
            mult3++
        if (i % 5 == 0)
            mult5++
        if (i % 9 == 0)
            mult9++
    }
    println("cantidad de multipos del 3. del 1 al 10000 es $mult3")
    println("cantidad de multipos del 5. del 1 al 10000 es $mult5")
    println("cantidad de multipos del 9. del 1 al 10000 es $mult9")
}
