package day2

fun main() {

    /** Kotlin in Action 168p 게터와 세터에서 뒷받침하는 필드에 접근 */
    class User(val name: String) {
        var address: String = "unspecified"
            set(value: String) {
                println("""
                    Address was changed for $name:
                    "$field" -> "$value".""".trimIndent())
                field = value
            }
    }

    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
//  프로퍼티 값을 바꿀 때 필드 설정 구문을 사용.
}