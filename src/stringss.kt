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


}