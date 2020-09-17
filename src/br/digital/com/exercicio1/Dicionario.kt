package br.digital.com.exercicio1

class Dicionario {

    val loteriaSonhos = mutableMapOf(0 to "Ovos", 1 to "Agua", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")

    val listaJoao = setOf("Juan", "Fissura", "Maromba")
    val listaMiguel = setOf("Night Watch", "Bruce Wayne", "Tampinha")
    val listaMaria = setOf("Wonder Woman", "Mary", "Marilene")
    val listaLucas = setOf("Lukinha", "Jorge", "George")

    val mapApelidos = mutableMapOf("Joao" to listaJoao, "Miguel" to listaMiguel, "Maria" to listaMaria, "Lucas" to listaLucas)

    init {
        loteriaSonhos.forEach { println (it) }
        mapApelidos.forEach { println (it) }
    }
}