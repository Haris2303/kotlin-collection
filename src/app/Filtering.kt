package app

/**
 * Filtering
 * satu operasi collection yang sangat populer
 * filtering bisa menggunakan predicate berupa lambda yang berisi kondisi filter nya
 * jika return true, maka data diterima, jika tidak maka dibuang
 */

fun main() {
    val list1 = listOf("Ucup", "Otong", "Yanto")
    val list2 = list1.filter { it.length >= 5 }
    println(list2)

    val list3 = list1.filterIndexed { index, _ -> index % 2 == 0}
    println(list3)

    val list4 = listOf(null, true, "Otong", 100)
    val listString = list4.filterIsInstance<String>()
    println(listString)
}