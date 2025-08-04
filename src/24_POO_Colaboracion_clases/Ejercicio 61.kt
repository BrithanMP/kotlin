package `24_POO_Colaboracion_clases`

class Cliente(var nombre: String, var monto: Float) {

    fun depositar(monto: Float) {
        this.monto += monto
    }

    fun extraer(monto: Float) {
        this.monto -= monto
    }

    fun imprimir() {
        println("$nombre tiene depositado la suma de $monto")
    }
}

class Banco {
    val Cliente1: Cliente = Cliente("Marco", 0f)
    val Cliente2: Cliente = Cliente("Sam", 0f)
    val Cliente3: Cliente = Cliente("Sharon", 0f)

    fun Operar() {
        Cliente1.depositar(300f)
        Cliente2.depositar(800f)
        Cliente3.depositar(70f)
        Cliente2.extraer(500f)
    }

    fun depositosTotales(){
        val total = Cliente1.monto + Cliente2.monto + Cliente3.monto
        println("El total del dinero en el banco es $total")
        Cliente1.imprimir()
        Cliente2.imprimir()
        Cliente3.imprimir()
    }
}

fun main(){
    val Banco1 = Banco()
    Banco1.Operar()
    Banco1.depositosTotales()
}