package app

/**
 * Partitioning
 * membagi collection menjadi dua
 * yang pertama include
 * yang kedua exclude
 */

fun main() {
    val list: List<String> = listOf("Yanto", "Ucup", "Otong", "Bambang", "Asep")

//    val pair: Pair<List<String>, List<String>> = list.partition { it.length > 5 }
    val (listInclude, listExclude) = list.partition { it.length > 5 }
    println(listInclude)
    println(listExclude)
}

