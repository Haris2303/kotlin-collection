package app

// Immutable Collection
fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) println(element)
}

// Mutable Collection
fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) println(element)
}

fun main() {
    displayCollection(listOf("asep", "yanto", "otong"))
    displayCollection(setOf("asep", "yanto", "otong"))
    displayCollection(mapOf("otong" to "Otong Surotong").entries)
//    displayCollection(mapOf("otong" to "Otong Surotong")) // error, Map bukan turunan collection

    displayMutableCollection(mutableListOf("asep", "yanto", "otong"))
    displayMutableCollection(mutableSetOf("asep", "yanto", "otong"))
    displayMutableCollection(mutableMapOf("otong" to "Otong Surotong").entries)
//    displayMutableCollection(mapOf("otong" to "Otong Surotong")) // error, Map bukan turunan collection
}