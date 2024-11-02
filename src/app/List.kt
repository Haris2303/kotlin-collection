package app

fun main() {
//    Immutablelist
    val list: List<String> = listOf("Otong", "Agus", "Ucup", "Asep")

    println(list[0])
    println(list[1])
    println(list.indexOf("Agus"))
    println(list.indexOf("Kosong"))
    println(list.contains("Ucup"))
    println(list.isEmpty())
    println(list)

//    Mutablelist
    val mutablelist: MutableList<String> = mutableListOf("Otong");
    mutablelist.add(1, "Agus")
    mutablelist.add(2, "Ucup")
    mutablelist.add(3, "Yanto")
    mutablelist[3] = "Asep"
    mutablelist.remove("Ucup")
    println(mutablelist)

    for (value in mutablelist) {
        println(value)
    }
}