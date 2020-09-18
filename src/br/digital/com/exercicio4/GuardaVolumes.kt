package br.digital.com.exercicio4

class GuardaVolumes() {

    var dicionario = mutableMapOf<Int,List<Peca>>()
    var contador = 0

    override fun toString(): String {
        return "GuardaVolumes(dicionario=$dicionario, ID=$contador)"
    }

    fun guardarPecas(listaDePecas : List<Peca>) : Int {
        dicionario.put(contador, listaDePecas)
        return contador++
    }

    fun mostrarPecas() {
        println(dicionario.toString())
    }

    fun mostrarPecas(numero : Int) {
        println(dicionario[numero])
    }

    fun devolverPecas(numero : Int) {
        dicionario.remove(numero)
        println("Peça(s) de código $numero removida(s)!")
    }
}