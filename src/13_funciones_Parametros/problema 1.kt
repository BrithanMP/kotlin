package `13_funciones_Parametros`

fun verificarClaves(Clave1: String, Clave2: String){
    if (Clave1 == Clave2){
        println("las claves son iguales")
    }else{
        println("las contraseñas no coinciden")
    }
}

fun main(){
    print("ingrese primera clave")
    val Clave1 = readln()
    print("ingrese segundo claves")
    val Clave2 = readln()
    verificarClaves(Clave1, Clave2)
}