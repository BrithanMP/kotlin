package `12_concepto_de_funciones`

fun menor(){
print("ingrese primer valor")
    val val1 = readln().toInt()
    print("ingrese segundo valor")
    val val2 = readln().toInt()
    print("ingrese tercer valor")
    val val3 = readln().toInt()
    if(val1 < val2 && val1 < val3) {
        println("el menor es $val1")
    }else if(val2 < val1 && val2 < val3){
        println("el menor es $val2")
    }else{
        println("el menor es $val3")
    }

}

fun main(){
    menor()
    menor()
}