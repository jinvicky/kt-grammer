package day4

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
//
//window.addMouseListener (
//    object : MouseAdapter() {
//        override fun mouseClicked(e: MouseEvent) {
//
//        }
//
//        override fun mouseEntered(e: MouseEvent) {
//
//        }
//    }
//)

// 객체에 이름을 붙여야 한다면 변수에 무명객체를 대입한다.
val listener = object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) {
    }
    override fun mouseEntered(e: MouseEvent) {}
}

// ::함수 표현식 느낌인가? 함수표현식처럼 변수에 할당하는 것?