package day6

import org.junit.Before
import org.junit.Test
import org.junit.Assert


class MyService {
    fun performAction (): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    @Before fun setup() {
        // MyService 객체 생성하여 초기화
        myService = MyService()
    }

    @Test fun testAction() {
        // 널 검사를 수행하지 않고 프로퍼티를 사용한다.
        Assert.assertEquals("foo",
            myService.performAction())
    }
}

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun String?.isNullOrBlank() : Boolean = this == null || this.isBlank()

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null) // null을 줘도 예외가 발생하지 않음!
}