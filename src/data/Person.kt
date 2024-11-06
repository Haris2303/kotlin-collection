package data

class Person(val name: String) {
    override fun hashCode(): Int {
        return this.name.hashCode()
    }

    override fun equals(other: Any?) = when(other) {
        is Person -> this.name == other.name
        else -> false
    }

    override fun toString(): String {
        return "Person with name $name"
    }
}