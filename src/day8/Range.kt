package day8

import java.time.LocalDate

val now = LocalDate.now()
val vacation = now..now.plusDays(10)

val n = 9

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext() = current <= endInclusive

        override fun next() = current.apply {
            current = plusDays(1)
        }
    }


fun main() {
//    println(now.plusWeeks(1) in vacation)
//    println(0..(n+1))
//    (0..n).forEach {print(it)}
      val newYear = LocalDate.ofYearDay(2017, 1)
      val daysOff = newYear.minusDays(1)..newYear
      for (dayOff in daysOff) {println(dayOff)}
}