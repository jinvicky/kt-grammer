package day6

fun <T: Any> printHashCode(t: T) {
    println(t.hashCode())
}

fun main() {
//    printHashCode(null) // 널이 불가능한 제네릭스 타입에 null을 넘길 수 없어 컴파일이 안된다.
    printHashCode(42)
}