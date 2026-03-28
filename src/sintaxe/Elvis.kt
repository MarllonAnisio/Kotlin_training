package sintaxe

/*
*
* entendendo o operador Elvis
* */

fun main() {

    /* primeiro devemos dissertar sobre null safety,
    o kotlin  não compila se tiver algum null no codigo e o operador Elvis serve para resolver isso
    voce se compromete a usar o operador Elvis sempre que for usar uma variavel que pode ser nula
    */

    val nome: String? = "Marllon anisio Camelo" // pode ser nulo ou nao
    // esse de fato ainda não é o elvis
    println(nome?.length) // null safe se for nulo ele vai retornar null se não ele vai retornar o tamanho da string


    //usando o elvis:

    val tamanho = nome?.length ?: 0 // o elvis age como um if else, se for nulo ele vai retornar 0
    println(tamanho)

    println(nome?.length ?: "nome nulo")

    println(nome?.length ?: nome)

    // agora testando o !!:

    /*
    * ele vai dar erro se for nulo, VOCE DELCARA QUE ELE MESMO PODENDO SER NULO, NÃO SERÁ.
    * esse operador é chamado de The Bang-Bang, devemos evitar por motivos obvios
    * */
    println(nome!!)


    println(nome!!.length)

    /* esse que usei bastante é uma rota segura contra nullable, e o safe call, nome?.length,
    eu falo abertamente que é pra ele tentar apenas se não for nulo
    */

}