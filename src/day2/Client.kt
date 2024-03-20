package day2

fun main() {
    class Client(val name: String, val postalCode: Int) {

        override fun equals (other: Any?): Boolean {
            if (other == null || other !is Client)
                return false
            return name === other.name &&
                postalCode == other.postalCode
        }
        override fun toString() = "Client (name=$name, postalCode=$postalCode)"

        override fun hashCode(): Int = name.hashCode() * 31 + postalCode

        // 불변 객체를 만들어서 바꿀 수 있다. 스레드 안전성을 높이는 좋은 방법
        fun copy(name: String = this.name, postalCode: Int = this.postalCode) = Client (name, postalCode)
    }

//    val client1 = Client("오현석", 4122)
//    println(client1)

    val lee = Client("이계영", 4122)
    println(lee.copy(postalCode = 4000))

}

