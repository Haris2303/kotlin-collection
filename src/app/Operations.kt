package app

fun main() {
    setOf("Otong", "Yanto", "Asep", "Ucup").forEach {
        println(it)
    }

    mutableSetOf("Ucup", "Otong", "Lanang").forEachIndexed { index, value ->
        println("$index -> $value")
    }
}