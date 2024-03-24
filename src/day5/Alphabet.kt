package day5

//import android.content.Context
//import android.widget.TextView
import java.lang.StringBuilder
import kotlin.text.buildString


fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z'){
        result.append(letter)
    }

    result.append("\nNot I know the alphabet!")
    return result.toString()
}

fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    // 선언하고 with에 파라미터로 넘겨서 리턴한다.
    return with(stringBuilder) {
        for(letter in 'A'..'Z'){
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

// apply를 사용한 처리
fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

//fun createViewWithCustomAttributes(context: Context) =
//    TextView(context).apply{
//        text = "Sample Text"
//        textSize = 20.0
//        setPading(10,0,0,0)
//    }

fun alphabet5() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}
fun main() {
//    println(alphabet())
//    println(alphabet2())
//    println(alphabet3())
//    println(alphabet4())
    println(alphabet5())
}