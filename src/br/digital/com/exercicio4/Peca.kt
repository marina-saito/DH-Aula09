package br.digital.com.exercicio4

class Peca(var marca : String, var modelo : String) {

    fun retirar() {}

    override fun toString(): String {
        return "Peca(marca='$marca', modelo='$modelo')"
    }


}