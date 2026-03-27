package Lesson2VariablesAndStrings

/*
* entendendo profundamente sobre funcoes
* */

fun main() {

    // temos uma palavra reservada para funcoes, a fun e o () para funcoes vazias e ainda com parametros


    /*
    * uma função simples:
    *
    * primeiro iniciamos com o fun, perceba que os parametros devemos primeiro apontar o nome e depois o tipo,
    * perceba tambem que depois dos parametros temos o tipo do retorno que devemos declarar-lo
    * */
    fun sum(a: Int, b: Int): Int{
        return a + b;
    }
    println(sum(1, 2))

    fun sum2(a: Int, b: Int) = a + b; // retorno implicito
    println(sum2(1, 2))

    fun nomeCompleto(nome: String, sobrenome: String): String{
        return "$nome $sobrenome"
    }
    fun nomeCompleto2(nome: String, sobrenome: String) = "$nome $sobrenome"

    println(nomeCompleto("Anisio", "Marllon"))
    println(nomeCompleto2("Anisio", "Marllon"))

    // função unit (sem retorno) pode ser declarada com o Unit ou simplesmente não deixar-la explicita:
    fun printHello() { //é como se antes dessa { tivesse um Unit
        println("Hello")
    }
    printHello()

    // declarando agora:

    fun printHello2(): Unit{
        println("Hello World")
    }
    printHello2()

    fun imc(peso: Double, altura: Double): Double{
        return peso / (altura * altura)
    }

    println(imc(70.0, 1.70))
}