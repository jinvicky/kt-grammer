package day11



class Person {

    private val _attributes = hashMapOf<String, String> ()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String
    get () = _attributes["name"]!! // 수동으로 맵에서 정보를 꺼낸다.

    /**
     * 또는 아래처럼 by 키워드 뒤에 맵을 직접 넣는 식으로 처리할 수 있다.
     * val name: String by _attributes
     */
}

//object Users: IdTable() {
//    val name = varchar("name", length = 50).index()
//    val age = integer("age")
//}
//
//class User(id: EntityID): Entity(id) {
//    var name: String by User.name
//    var age: Int by User.age
//}

/**
 * 고차 함수 정의
 */
fun twoAndThree (operation: (Int, Int) -> Int) {
    val result = operation(2,3)
    println("The resut is $result")
}

fun main() {
    val p = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")

    for((attrName, value) in data )
        p.setAttribute(attrName, value)

    println(p.name)

    twoAndThree {a,b -> a + b}
    twoAndThree {a,b -> a * b}
}