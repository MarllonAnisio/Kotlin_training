package sintaxe

fun  main() {

    val items = mutableListOf("item1", "item2", "item3")

    for(item in items){
        println(items)
    }

    /*
    posso checar se existe um item na lista usando o in por exemplo
    * */
    when {
        "item1" in items -> println("tem item1")
        "basketball" in items -> println("tem basquete")
    }

    val fruits = setOf("banana", "apple", "orange", "Watermelon")
    fruits.filter{it.startsWith("a")}
        .sortedBy{ it}
        .map{ it.uppercase()}
        .forEach{ println(it) }

}