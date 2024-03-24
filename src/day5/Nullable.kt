package day5

fun strLenSafe (s: String?): Int = if (s != null) s.length else 0

fun strLenSafeWithElvis (s: String?): Int = s?.length ?: 0

fun printAllCaps (s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

class Employee (val name: String, val manager: Employee?)

fun managerName (employee: Employee): String? = employee.manager?.name //없으면 null을 반환

class Address (val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company (val name: String, val address: Address?)
class Person (val name: String, val company: Company?)

fun Person.countryName(): String {
//    val country = this.company?.address?.country
//    return if (country != null) country else "Unknown"

    //elvis 연산자를 쓰면 더 줄일 수 있다.
    return this.company?.address?.country ?: "Unknown"
}

fun printShippingLabel (person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with (address) { // 범위를 address 객체로 한정한다.
        // 위에서 with로 범위를 address로 한정했기에 가능. 없을 시 접근 에러.
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main() {
    val x: String? = null
//    println(strLenSafe(x))
//    println(strLenSafe("abc"))
//    printAllCaps("abc")
//    printAllCaps(null)

//    val ceo = Employee("Da Boss", null)
//    val developer = Employee("Bob Smith", ceo)
//    println(managerName(developer))
//    println(managerName(ceo))

//    val person = Person("Dmitry", null)
//    println(person.countryName())

//    println(strLenSafeWithElvis("abc"))
//    println(strLenSafeWithElvis(null))

    // address를 가진 jetbrains를 Dmitry가 다니고 있다.
    val address = Address ("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)

    printShippingLabel(person)
    printShippingLabel(Person("Alexey", null))


}