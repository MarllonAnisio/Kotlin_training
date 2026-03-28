package sintaxe

/**
 * no kotlin não temos ternarios entao podemos fazer de forma diferente
 */

fun main() {

    var idade: Int = 25


    if(idade > 18) "maior de idade" else "menor de idade"


    fun imc(peso: Double, altura: Double): Double{
        return peso / (altura * altura)
    }
    fun calcularIMC(imc: Double): String{
        if(imc < 18.5) return "magreza"
        else if(imc < 25) return "normal"
        else return "sobrepeso"

    }

    println(calcularIMC(imc(70.0, 1.70)))

    // entendendo o when, é um switch case aprimorado e mais facil de escrever kkkk

    fun calcularImc2(imc: Double): String = when{

        imc < 18.5 -> "magreza"
        imc < 25 -> "normal"
        imc < 35 -> "sobrepeso"
        else -> "obesidade"
    }
    println(calcularImc2(imc(100.0, 1.70)))

// 2. Chamando
    cronometro {
        println("Estou fazendo um café...")
    }
    fun tarefa1(inicio: Int, fim: Int): Unit {
        for(i in inicio..fim) println(i)
    }
    tarefa{
        tarefa1(2,100)
        println("Fim")
    }

}
inline fun cronometro(tarefa: () -> Unit) {
    val inicio = System.currentTimeMillis()
    tarefa() // Executa a tarefa
    val fim = System.currentTimeMillis()
    println("Levou ${fim - inicio}ms")
}
inline fun <T> tarefa(tarefa: () -> T): T {
    val inicio = System.currentTimeMillis()
    val resultado = tarefa()
    val fim = System.currentTimeMillis()
    return resultado
}