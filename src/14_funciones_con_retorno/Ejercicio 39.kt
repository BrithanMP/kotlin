package `14_funciones_con_retorno`

fun largo(nombre: String): Int {
    return nombre.length
}

fun main(){
    print("ingrese un nombre:")
    val nombre1 = readln() //Brithan
    print("ingrese otro nombre:")
    val nombre2 = readln() //Joel
    if (largo(nombre1) == largo(nombre2))
        println("los nombres: $nombre1 y $nombre2 tiene la " + "misma cantidad de caracteres")
    else
        if (largo(nombre1) > largo(nombre2))
            print("$nombre1 es màs largo")
    else
        print("$nombre2 es m'as largo")
}