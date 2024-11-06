package app

fun main() {
    val pair: Pair<String, String> = Pair("Otong", "Surotong")
    println(pair.first)
    println(pair.second)

    val pair2: Pair<String, String> = "Ucup" to "Surucup"
    println(pair2.first)
    println(pair2.second)
}