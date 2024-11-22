package app

/**
 * Zipping adalah transformasi yang digunakan untuk menggabungkan dua buah colletion
 */

fun main() {
    val list1 = listOf("Ucup", "Otong", "Yanto")
    val list2 = listOf("Universitas", "Muhammadiyah", "Sorong")

//    zip
    val list3: List<Pair<String, String>> = list1.zip(list2)
    val list4: List<String> = list1.zip(list2) {item1, item2 ->
        "$item1 $item2"
    }

    println(list3)
    println(list4)

//    unzip
    val list: List<Pair<String, String>> = listOf(
        "Otong" to "Nabire",
        "Ucup" to "Jayapura",
        "Yanto" to "Sorong"
    )

    var pair: Pair<List<String>, List<String>> = list.unzip()

    println(pair.first)
    println(pair.second)
}
