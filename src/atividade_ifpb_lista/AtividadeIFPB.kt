package atividade_ifpb_lista

fun main() {

    // 1) Implemente uma função que retorna o último elemento de uma lista.
    //> last(listOf(1, 1, 2, 3, 5, 8))
    //8

    val lista = listOf(1, 1, 2, 3, 5, 8)

    fun ultimoValor(lista: List<Any>): Any {
        /**
         * A forma mais facil de ser feita é usando o last recurso já presente na lista
         *  return lista.last()
         * */

        return lista[lista.size - 1]
    }
    println("o ultimo valor da lista $lista é ${ultimoValor(lista)}")
    println("======================================================================================")





    //2) Implemente uma função que retorna o penúltimo elemento de uma lista.
    //> last(listOf(1, 1, 2, 3, 5, 8))
    //5
    val nomes = listOf("Anisio", "Marllon", "Emily", "Maria", "lourdes")
    fun penultimoItem(lista: List<Any>): Any{
        return lista[lista.size - 2]
    }
    println("o penultimo valor da lista $nomes é ${penultimoItem(nomes)}")
    println("o penultimo valor da lista $lista é ${penultimoItem(lista)}")
    println("======================================================================================")

}