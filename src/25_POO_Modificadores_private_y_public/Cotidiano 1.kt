package `25_POO_Modificadores_private_y_public`

class cuentaBancaria{
    private var saldo: Int = 0

    fun depositar( monto: Int){
        if (monto > 0)
            saldo += monto
        else
            println("ERROR, el monto a ingresar el inferior a 0")
        montoValido(monto)
        consultarSaldo()
    }

    fun retirar(monto: Int){
        if (monto > 0 || saldo >= monto)
            saldo = saldo - monto
        else {
            println("ERROR, el saldo es inferior al monto solicitado para retirar")
        }
        puedeRetirar(monto)
        consultarSaldo()
    }

    private fun montoValido(monto: Int) {
        if (monto > 0)
            println("True, se puede aumentar el saldo por la transacción")
        else
            println("Negativo el operativo")
    }

    private fun puedeRetirar(monto: Int) {
        if (monto > 0 ||saldo > monto)
            println("True, se puede disminuir el saldo")
        else
            println("Negativo el operativo")
    }

    fun consultarSaldo(){

        println("Su saldo actual es de: $saldo")
    }
}

fun main(){
    val cuenta = cuentaBancaria()
    cuenta.depositar(8000)
    cuenta.retirar(7900)
}