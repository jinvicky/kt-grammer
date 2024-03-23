package day3

//class User {
//    val nickname: String
//
//    constructor(email: String) {
//        nickname = email.substringBefore('@')
//    }
//
//    constructor(facebookAccountId: Int) {
//        nickname = getFacebookName(facebookAccountId)
//    }
//}

//부 생성자를 팩토리 메서드로 대신하기
class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))

//        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
        // where is getFacebookName...?
    }
}

fun main() {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
//    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
}