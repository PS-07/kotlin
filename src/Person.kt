/* def-1
class Person(val firstName: String, val lastName: String) {
    init { println("init 1") }
    constructor(): this("Lucas","Vasquez") {
        println("secondary constructor")
    }
    init { println("init 2") }
}*/

// def-2
// val has get() by default
// var has get() and set() by default
class Person(val firstName: String = "Lucas", val lastName: String = "Vasquez") {
    // override get() and set()
    var nickName: String? = null
        set(value) {
            field = value
            println("nickname is $value")
        }
        get() {
            println("returned value is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName $nickNameToPrint $lastName")
    }
}