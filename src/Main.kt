// val is immutable (value can't be reassigned)
// var is mutable (value can be reassigned)
// var, val defined outside any function are called top-level
// String is non-null. To assign a null value use String?
var greeting: String? = null

// Kotlin support type inferences
val name = "Jane"

/*fun getColor(): String {
      return "verde"
  }
this is equivalent to: */
fun getColor() = "verde"    // single-expression function

fun setColor(color1:String, color2: String) = println("$color1 y $color2")

fun printDay(prefix:String, days:List<String>) {
    days.forEach { day -> println("$prefix es $day") }
}

// vararg is used for variable number of params
fun printDay2(prefix:String, vararg days:String) {
    days.forEach { day -> println("$prefix es $day") }
}

fun greetPerson(greeting: String = "Hi", name: String = "Juan") = println("$greeting $name")

fun main() {
    println(name)
    greeting = "hi"
    if (greeting != null)
        println(greeting)
    val greetingToPrint = when (greeting) {
        null -> greeting
        else -> "HI"
    }
    println(greetingToPrint)
    println(getColor())
    setColor("blanco","negro")

    // Collections - array, list, map   (they are immutable)
    // for mutable collections, use mutableMapOf etc.
    // all functions are same for listOf as well
    val colors = arrayOf("amarillo","azul","gris")
    println(colors.size)
    println(colors[0])
    println(colors.get(2))
    colors.forEach { color -> println(color) }
    colors.forEachIndexed { index, color -> println("$color is at index $index") }

    val num = mutableMapOf(1 to "uno", 2 to "dos", 3 to "tres")
    num.put(4,"cuatro")
    num.forEach { key, value -> println("$key -> $value") }

    val days = listOf("lunes","martres","meircoles")
    printDay("hoy",days)
    var dias = arrayOf("viernes","sabado","domingo")
    printDay2("mañana")
    // to pass an array to a vararg argument, use the spread(*) operator
    printDay2("mañana",*dias)

    // named and default args
    greetPerson(name = "Marco", greeting = "Hola")      // order of args doesn't matter since (=) is used
    greetPerson(name = "Lucas")     // it's not necessary to pass all args since default value is assigned
    greetPerson()

    // Class
    // use def-1
    val person1 = Person("Marco","Asensio")
    person1.firstName
    person1.lastName

    // init blocks run in the order of implementation, but before the secondary constructor
    val person2 = Person()
    person2.firstName
    person2.lastName

    //use def-2
    val person3 = Person()
    person3.firstName
    person3.lastName
    person3.nickName = "Raul"
    println(person3.nickName)

    val person4 = Person()
    person4.printInfo()
}