package day5

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JList

class Person2 (val firstName: String, val lastName: String) {
    override fun equals (o: Any?): Boolean {
        val otherPerson = o as? Person2 ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode (): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

class CopyRowAction (val list: JList<String>) : AbstractAction() {
    override fun isEnabled(): Boolean =
        list.selectedValue != null

    override fun actionPerformed(e: ActionEvent) {
        val value = list.selectedValue!!
        // value를 클립보드로 복사
    }
}

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main() {
    val p1 = Person2("Dmitry", "Jemerov")
    val p2 = Person2("Dmitry", "Jemerov")

//    println(p1 == p2)
//    println(p1.equals(42))

//    ignoreNulls(null)

    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it)}

    email = null
    email?.let  { sendEmailTo(it)}
}
