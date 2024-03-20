package day2

fun main() {

    /** Kotlin in Action 170p 접근자의 가시성 변경 */
    class LengthCounter {
        var counter: Int = 0
          private set
        fun addWord(word: String) {
            counter += word.length
        }
    }

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}