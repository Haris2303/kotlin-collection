package app

import java.lang.StringBuilder

/**
 * String Representation
 * operasi transformasi untuk mengubah collection menjadi string
 */

fun main() {
    val list: List<String> = listOf("Otong", "Ucup", "Yanto")

    val string1: String = list.joinToString(" ", "|", "|")
    println(string1)

    val string2: String = list.joinToString(" ", "|", "|") { it.uppercase() }
    println(string2)

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, " ", ">", "<")
    list.joinTo(builder, " ", "@", "@")
    val string3 = builder.toString()
    println(string3)

    val numbers: List<Int> = (1..10).toList()
    println(numbers.joinToString())
}