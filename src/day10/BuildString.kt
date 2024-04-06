package day10

fun buildString (
    builderAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun buildString2 (
    builderAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}


fun main() {
    val s = buildString {
        it.append("Hello, ")
        it.append("World!")
    }

//    println(s)

    val s2 = buildString2 {
        this.append("Hello,")
        append("jinvicky")
    }

//    println(s2)

    val appendExcl : StringBuilder.() -> Unit = {
        this.append("!")
    }

    val stringBuilder= StringBuilder("Hi")
    stringBuilder.appendExcl() // 확장함수처럼 호출한다.
    println(stringBuilder)
    println(buildString(appendExcl)) //함수를 인자로 넘긴다.
}