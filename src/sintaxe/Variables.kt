package sintaxe

fun main() {
    val name = "Marllon"

    /**
     * val torna a variavel imutavel é como se fosse uma constante final, é caixão fechado,
     * mesmo se voce tentar algo como name = "Anisio" isso é um erro esse val nome será marllon até o fim de sua vida
     * */
    println(name)


    /*
    * o var ele é de boa, pode ser alterado, pode ser reatribuido, pode ser redeclarado
    * ele é basicamente o let do javaScript, mas respeitando seu tipo.
    * */
    var age = 20; //int
    age = 21;

    // lembrando que para deixar claro o tipo de variavel podemos usar o tipo inferido
    var nome: String = "Anisio"
    var idade: Int = 21
    var altura: Double = 1.75
    var peso: Float = 70.5f // em Float devemos sempre colocar o f no final se for 10.0 entao tem que ser 10.0f
    var isMarried: Boolean = true
    var isStudent: Boolean = false
    var byte: Byte = 12 // byte serve para armazenar valores de 0 a 255
    var short: Short = 12345
    var long: Long = 12345678901L // L no final
    var char: Char = 'a'



    println(age)

}