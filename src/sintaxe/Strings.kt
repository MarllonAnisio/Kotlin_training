package sintaxe

/*
*   aula sobre strings e usando \\ para conseguir colocar "" dentro da string
* */
fun main() {
    println("Hello, Marllon how are you? what is your \"surname\" ");
    // se voce colocar dois \\ ele vai interpletar apenas como um \
    val name = "Marllon";
    val surname = "anisio";
    val birthYear = 1998;

    // no kotlin não é necessario colocar + para concatenar strings
    println("My surname is $surname");

    // para expressoes mais complexas
    println("My name is $name, my age is ${birthYear - 2026}");


    /*
    * no kotlin tem o mesmo esquema que o python se voce precisa por exemplo colocar uma string dentro de uma string
    * ou criar um json ou ate mesmo uma string gigantesca, podemos usar aspas triplas
    * */

    val formatado = """
        "my name is $name, my age is ${birthYear - 2026}",
        "my surname is $surname",
        "my birth year is $birthYear",
        "my name is $name",
        "my surname is $surname",
        "etc.."
    """.trimIndent(); // Remove o espaço em branco da esquerda
    println(formatado);
}



