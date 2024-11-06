package app

import data.Person

fun main() {

    println("===== Immutable Set ======")

//    ImmutableSet
    val set: Set<Person> = setOf(
        Person("Yanto"),
        Person("Asep"),
        Person("Budiman"),
        Person("Otong"),
        Person("Asep"),
        Person("Rusdi"),
    )

    println(set.size)
    println(set.contains(Person("Ambatukam")))

    for (person in set) {
        println(person.toString())
    }

    println("===== Mutable Set ======")

//    MutableSet
    val mutableSet: MutableSet<Person> = mutableSetOf(Person("Otong"))

    mutableSet.add(Person("Rusdi"))
    mutableSet.add(Person("Yanto"))
    mutableSet.add(Person("Gamabuta"))
    mutableSet.add(Person("Yanto"))

    println(mutableSet.size)

    for (person in mutableSet) {
        println(person.toString())
    }

    mutableSet.remove(Person("Rusdi"))
    println(mutableSet.size)
}