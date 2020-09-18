package br.digital.com.exercicio4

fun main() {
    val peca1 = Peca("Adidas", "XX")
    val peca2 = Peca("Nike", "YY")
    val peca3 = Peca("Puma", "ZZ")
    val peca4 = Peca("Under Armour", "WW")
    val guardaVol = GuardaVolumes()

    println("Código das peças 1 e 2: ${guardaVol.guardarPecas(listOf(peca1, peca2))}")
    print("Lista de peças: ")
    guardaVol.mostrarPecas()
    println()

    println("Código da peça 3: ${guardaVol.guardarPecas(listOf(peca3))}")
    guardaVol.devolverPecas(0)
    print("Lista de peças: ")
    guardaVol.mostrarPecas()
    println()

    println("Código da peça 4: ${guardaVol.guardarPecas(listOf(peca4))}")
    print("Lista de peças: ")
    guardaVol.mostrarPecas()
}