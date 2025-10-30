fun strip(s: String) = s.filterNot(Char::isWhitespace)

fun main(args: Array<String>) {
    println(strip("   Hello, world!   "))
    println(strip("Kotlin is fun"))

    var tvShows = "many"
    println("I have $tvShows TV shows to watch.")
    tvShows = "a few"
    println("I have $tvShows TV shows to watch.")
    tvShows = "none"
    println("I have $tvShows TV shows to watch.")

    // desafio: 1 fazer o coelho
    var linha = " (\\(\\"
    var linha2 = " (-.-)"
    var linha3 = " 0_(\")(\")"
    println(linha)
    println(linha2)
    println(linha3)

}