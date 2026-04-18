package sintaxe

fun main() {


    val itens = listOf("Anisio", "Marllon", "Ana");

    for(item in itens){
        println(item)
    }

    val itens2 = listOf("apple", "banana", "orange");
    for(index in itens2.indices){
        println(itens2[index])
    }

    var index = 0
    while(index < itens2.size){
        println("item com o $index é ${itens2[index]}")
        index++
    }


}