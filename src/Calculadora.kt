// comentarios de uma linha
fun main(args: Array<String>) {
    println("Hello, Marllon how are you!?")
    println("I am learning Kotlin") // aprendendo comentarios
}
/*
* comentarios de varias linhas
*
* */
fun sum(a: Int, b: Int) = a + b

fun subtract(a: Int, b: Int): Int {
    return a - b
}
/*
* testando multiplicação
*
* */
fun multiply(a: Int, b: Int) = a * b
/*
* testando divisão
* */
fun divide(a: Int, b: Int) = a / b
/*
* testando média
* */
fun mean(a: Int, b: Int) = (a + b) / 2
/*
* testando quadrado
* */
fun square(n: Int) = n * n
/*
* testando cubo
* */
fun cube(n: Int) = n * n * n
/*
* testando potência
* */
fun power(n: Int, p: Int) = Math.pow(n.toDouble(), p.toDouble()).toInt()


