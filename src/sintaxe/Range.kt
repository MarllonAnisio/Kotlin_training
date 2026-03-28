package sintaxe

// no kotlin conseguimos fazer range de numeros e de strings usando o operador .. ate
fun main() {
    for(i in 1..10) println(i);

    val lista = listOf("Anisio", "Marllon", "Ana");

    if(-1 !in 0..lista.lastIndex){
        println("não existe no range");

        println(lista.lastIndex)
    }

    if(lista.size in 0..lista.lastIndex){
        println("o tamanho ta fora do range")
    }
    println(lista.size)


    // podemos interar em um range
    for(x in 1..10){
        print(x)
    }
    // temos o step tambem ele é usado para pular valores
    for(x in 1..10 step 2){
        println(x) // pulando 2 em 2
    }
    println("=========================================")
    // podemos usar o downTo para inverter o range

    for(x in 10 downTo 1 step 2){
        println(x)
    }

}