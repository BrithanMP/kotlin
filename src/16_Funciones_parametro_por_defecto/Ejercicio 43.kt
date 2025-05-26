package `16_Funciones_parametro_por_defecto`

fun TituloSubrayado(titulo: String, caracter: String = "*"){
    for(i in 1..titulo.length)
        print(caracter)
    println()
}

fun main(){
    TituloSubrayado("sistema de administracion")
    TituloSubrayado("ventas", "*")
}