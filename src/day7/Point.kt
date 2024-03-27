package day7

data class Point(val x: Int, val y: Int) {
//    방법 1. operator를 써서 산술 연산자를 오버로딩한다.
//    operator fun plus (other: Point): Point {
//        return Point(x + other.x, y + other.y)
//    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if (obj !is Point) return false
        return obj.x == x && obj.y == y
    }
}

/**
 * plus를 확장 함수로 만든다.
 */
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

/**
 * 두 피연산자의 타입이 다른 연산자
 */
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}
fun main() {
//    val p1 = Point(10, 20)
//    val p2 = Point(30, 40)
//    println(p1 + p2)

    val p = Point(10, 20)
//    println(p * 1.5)
//    println('a' * 3)
//    println(-p)

    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5,5))
    println(null == Point(1,2))



}