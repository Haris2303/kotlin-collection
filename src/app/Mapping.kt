package app

/**
 * Mapping adalah operasi transformasi pada koleksi di Kotlin yang digunakan
 * untuk mengubah data dari satu tipe ke tipe lain, misalnya mengubah
 * List<String> menjadi List<Int>.
 */

fun main() {

    val list: List<String> = listOf("Otong", "Ucup", "Yanto")

//    Transformasi manual
    val temp = mutableListOf<String>()
    for (value in list) {
        temp.add(value.uppercase())
    }

    val list2 = temp.toList()
    println(list2)

//    Menggunakan map
    val upperCaseList = list.map {it.uppercase()}
    println(upperCaseList)

//    Menggunakan mapIndexed
    val oddIndexedNames = list.mapIndexedNotNull { index, name ->
        if(index % 2 != 0) name else null // Output: [Ucup]
    }
    println(oddIndexedNames)

//    mapNotNull
    val numbers = (1..10).toList()
    val oddNumbers = numbers.mapNotNull { if (it % 2 != 0) it else null }
    println(oddNumbers) // Output: [1, 3, 5, 7, 9]

    /**
     * Transformasi map
     *
     * mapKeys: Mengubah kunci pada Map.
     * mapValues: Mengubah nilai pada Map.
     */

    val map = mapOf(1 to "Otong", 2 to "Ucup", 3 to "Yanto")
    val newKeys = map.mapKeys { it.key * 10 }
    val upperValues = map.mapValues { it.value.uppercase() }
    println(newKeys) // Output: {10=Otong, 20=Ucup, 30=Yanto}
    println(upperValues) // Output: {1=OTONG, 2=UCUP, 3=YANTO}
}