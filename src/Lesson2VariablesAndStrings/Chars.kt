package Lesson2VariablesAndStrings

// aprendendo sobre chars

fun main() {
    /*
    * O char representa um unico caractere, ao contrario da string que usam aspas duplas os chars usam aspas simples
    * 1 char = 1 byte
    */
    val char: Char = 'a';
    val char2: Char = 'B';
    val numeroChar: Char = '7';

    println(char);
    println(char2);
    println(numeroChar);


  /*
  * Para o processador, o caractere 'A' não existe. O que existe é o número 65.
  * No Kotlin, você pode facilmente navegar entre o símbolo e o seu código numérico (chamado de Unicode Code Point)
  * */
    println(char.code);
    println(char2.code);
    println(numeroChar.code);

    val codigo: Int = 66; // = B
    println(codigo.toChar());

    /*
    * Dá pra representar qualquer símbolo do planeta usando o código hexadecimal dele com o prefixo \u:
    */
    val coracao = '\u2764'; // um coração
    println(coracao);
    val grego = '\u03a9';
    println(grego);

    // se tratando de strings
    val alfabeto: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (letra in alfabeto) { // estamos pegando cada letra do alfabeto na pratica a string é isso: ['A', 'B', 'C', ..., 'Z',']
        println(letra);
    }

}