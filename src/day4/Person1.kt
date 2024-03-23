package day4

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person1 (val name: String) {
    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person {
            return Person("Alice")
        }
    }
}