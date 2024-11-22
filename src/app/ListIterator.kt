package app

// Immutable Iterator
fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    println("Display Previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

// Mutable Iterator
fun <T> displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val item = mutableListIterator.next()
        if (item % 2 == 1) mutableListIterator.remove()
    }
}

fun main() {
    println("======= Immutable List Iterator ==========")
    displayListIterator(listOf("Ucup", "Asep", "Otong").listIterator())

    println("======== Mutable List Iterator ==========")
    val mutableList = mutableListOf(1,2,3,4,5,6,7,8,9)
    removeOddNumber(mutableList.listIterator())
    displayMutableListIterator(mutableList.listIterator())
}