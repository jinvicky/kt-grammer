package day3


class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main() {
    A.bar()
}