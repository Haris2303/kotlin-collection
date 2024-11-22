package app

/**
 * Testing
 * operation yang bisa digunakan untuk mengecek isi data dari collection
 */

fun main() {
    val list = listOf("Ucup", "Otong", "Yanto", "Bambang")
    println(list.any { it.length > 5 })
    println(list.none { it.length > 5})
    println(list.all { it.length > 5 })
    println(list.any())
    println(list.none())
}