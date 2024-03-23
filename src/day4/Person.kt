package day4

class Person(val name: String) {
    companion object Loader {
        fun fromJSON (jsonText: String): Person {
            return Person("Demitry") // 코드가 생략처리되었는데 어떻게 json파싱을 하는지 찾아봐야 할듯 .
        }
    }
}

fun main() {
    val person = Person.fromJSON("{name: 'Dimitry'}")
    println(person.name)
    // Dimitry
}