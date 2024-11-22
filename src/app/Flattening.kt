package app

class Member(val name: String, val hobbies: List<String> )

/**
 * Flattening
 * operasi transformasi untuk menjadikan nested collection menjadi flat
 */

fun main() {
    val list1: List<List<String>> = listOf(
        listOf("Yanto", "Otong", "Ucup"),
        listOf("Yanto", "Otong", "Ucup"),
        listOf("Yanto", "Otong", "Ucup"),
        listOf("Yanto", "Otong", "Ucup"),
    )

    val listString: List<String> = list1.flatten()
    println(listString)

   val members: List<Member> = listOf(
       Member("Ucup", listOf("Belajar", "Ngoding")),
       Member("Yanto", listOf("Angkat Beban", "Berenang")),
       Member("Otong", listOf("Berenang", "Traveling"))
   )

//    val hobbies = members.map { it.hobbies }.flatten()
    val hobbies: List<String> = members.flatMap { it.hobbies }
    print(hobbies)
}