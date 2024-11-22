package app

// Immutable Itarable
fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while(iterator.hasNext()) println(iterator.next())
}

// Mutable Itarable
fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while(iterator.hasNext())  {
//        iterator.remove() // menghapus data di iterasi saat ini
        println(iterator.next())
    }
}

fun main() {
    displayIterable(listOf("Yanto", "Ucup", "Papay"))
    displayIterable(setOf("Yanto", "Ucup", "Papay"))

    displayMutableIterable(mutableListOf("Yanto", "Ucup", "Papay"))
    displayMutableIterable(mutableSetOf("Yanto", "Ucup", "Papay"))
}