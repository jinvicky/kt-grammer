package day7

operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1-> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)
operator fun MutablePoint.set(index: Int, value: Int) {
    when(index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)
operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

fun main() {
//    val p = Point(10, 20)
//    println(p[1])

    val p = MutablePoint(10, 20)
    p[1] = 42
    println(p)

    /**
     * in 관례
     */
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5,5) in rect)

}