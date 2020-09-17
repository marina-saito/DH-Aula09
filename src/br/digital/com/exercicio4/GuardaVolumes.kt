package br.digital.com.exercicio4

class GuardaVolumes() {

    var dicionario = mutableMapOf<Int,List<Peca>>()
    var contador = 0

    fun guardarPecas(listaDePecas : List<Peca>) : Int {
        dicionario.put(contador, listaDePecas)
        return contador++
    }

    fun mostrarPecas() {
        println(dicionario)
    }

    fun mostrarPecas(numero : Int) {
        println(dicionario[numero])
    }

    fun devolverPecas(numero : Int) {
        dicionario.remove(numero)
    }
}