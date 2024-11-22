package app

fun main() {
    val array = arrayOf(1,2,3,4,5,6,7,8,9)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableList = range.toMutableList()
    val mutableSet = range.toMutableSet()
}