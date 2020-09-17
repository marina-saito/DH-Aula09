package br.digital.com.exercicio2

fun main() {

    val lista = mutableListOf<Int>()
    lista.addAll(listOf(1,5,5,6,7,8,8,8))
    println(lista)

    val setNumeros = mutableSetOf<Int>()
    setNumeros.addAll(lista)
    println(setNumeros)

}