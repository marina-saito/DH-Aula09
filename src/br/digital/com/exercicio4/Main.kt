package br.digital.com.exercicio4

fun main() {

    val peca1 = Peca("Adidas", "XX")
    val peca2 = Peca("Nike", "YY")

    val guardaVol = GuardaVolumes()

    println("Seu código é: ${guardaVol.guardarPecas(listOf(peca1, peca2))}")
    guardaVol.mostrarPecas()
    guardaVol.devolverPecas(0)
    guardaVol.mostrarPecas()

}