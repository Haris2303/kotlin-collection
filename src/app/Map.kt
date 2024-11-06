package app

fun main() {

//    Immutable Map
    println("===== Immutable Map =====")
    val map: Map<String, String> = mapOf(
        Pair("01", "Otong"),
        "02" to "Yanto",
        "03" to "Ambatukam"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }

//    Mutable Map
    println("===== Mutable Map =====")
    val mutableMap: MutableMap<String, String> = mutableMapOf(
        "1" to "Bawang",
        "2" to "Rica",
        "3" to "Lada",
        "4" to "Jahe"
    )

    mutableMap["5"] = "Jeruk Nipis"
    mutableMap.remove("3")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}